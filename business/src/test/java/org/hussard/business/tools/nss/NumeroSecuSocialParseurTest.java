package org.hussard.business.tools.nss;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.hussard.business.model.NirInformations;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/**
 * Mois de naissance :
 * 2 et 3
 * deux derniers chiffres de l'année de naissance
 * (ce qui donne l’année à un siècle près) 	de 00 à 99
 */
class NumeroSecuSocialParseurTest {
    /**
     * Arguments.of("105042601414554", "2005"),
     * Arguments.of("286129147102722", "1986"),
     * Arguments.of("302021455505061", "2002"),
     * Arguments.of("455021455505041", "1955"),
     * Arguments.of("712021455505058", "2012"),
     * Arguments.of("840021455505091", "1940")
     * return Stream.of(
     * Arguments.of("105042601414554", "1"),
     * Arguments.of("286129147102722", "2"),
     * Arguments.of("305042601414551", "3"),
     * Arguments.of("405042601414501", "4"),
     * Arguments.of("705042601414545", "7"),
     * Arguments.of("805042601414592", "8")
     * Arguments.of("286069147102723", "06"),
     * Arguments.of("302121455505035", "12"),
     * Arguments.of("455031455505057", "03"),
     * Arguments.of("712091455505073", "09"),
     * Arguments.of("840015145550272", "01")
     * );
     */
    private static Stream<Arguments> nirValide() {
        return Stream.of(
                Arguments.of("1 05 01 26 014 145 06", "1", "2005", "01", "26", "014", "145", "06"),
                Arguments.of("105012601414506", "1", "05", "01", "26", "014", "145", "06")
        );
    }

    private static Stream<Arguments> nirNonValide() {
        return Stream.of(
                Arguments.of("505042601414548"),
                Arguments.of("686129147102795"),
                Arguments.of("905042601414542"),
                Arguments.of("005042601414507")
        );
    }

    @ParameterizedTest
    @MethodSource("nirValide")
    void extractMoisNaiss_Quand_NirValide_Attend_MoisNaiss(String nir,
                                                           String sexe,
                                                           String annee,
                                                           String mois,
                                                           String dep,
                                                           String numComm,
                                                           String numOrdre,
                                                           String cle) {
        NumeroSecuSocialParseur parseur = new NumeroSecuSocialParseur();
        NirInformations parse = parseur.parse(nir);

        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(parse.getSexe()).isEqualTo(sexe);
        softly.assertThat(parse.getAnneeNaiss()).isEqualTo(annee);
        softly.assertThat(parse.getMoisNais()).isEqualTo(mois);
        softly.assertThat(parse.getDepartementNaiss()).isEqualTo(dep);
        softly.assertThat(parse.getNumCommuneNaiss()).isEqualTo(numComm);
        softly.assertThat(parse.getNumOrdreNaiss()).isEqualTo(numOrdre);
        softly.assertThat(parse.getCleCtrNir()).isEqualTo(cle);

        softly.assertAll();
    }

    @ParameterizedTest
    @MethodSource("nirNonValide")
    void extractSexe_Quand_NirNonValide_Attend_Exception(String nir) {
        NumeroSecuSocialParseur parseur = new NumeroSecuSocialParseur();
        Assertions.assertThatThrownBy(() -> parseur.parse(nir))
                .isInstanceOf(NumeroSecuSocialException.class)
                .hasMessage("Code Sexe non valide !!");
    }

}
