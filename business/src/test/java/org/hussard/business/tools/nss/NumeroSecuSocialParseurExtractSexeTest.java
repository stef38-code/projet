package org.hussard.business.tools.nss;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/**
 * sexe : 1 pour les hommes, 2 pour les femmes,
 * 3, 4, 7 ou 8 pour les personnes en cours d'immatriculation en France
 */
class NumeroSecuSocialParseurExtractSexeTest {
    private static Stream<Arguments> nirValide() {
        return Stream.of(
                Arguments.of("105042601414554", "1"),
                Arguments.of("286129147102722", "2"),
                Arguments.of("305042601414551", "3"),
                Arguments.of("405042601414501", "4"),
                Arguments.of("705042601414545", "7"),
                Arguments.of("805042601414592", "8")
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
    void extractSexe_Quand_NirValide_Attend_leCodeSexe(String nir, String sexeValue) {
        NumeroSecuSocialParseur parseur = new NumeroSecuSocialParseur();
        String sexe = parseur.extractSexe(nir);
        Assertions.assertThat(sexe).hasToString(sexeValue);
    }

    @ParameterizedTest
    @MethodSource("nirNonValide")
    void extractSexe_Quand_NirNonValide_Attend_Exception(String nir) {
        NumeroSecuSocialParseur parseur = new NumeroSecuSocialParseur();
        Assertions.assertThatThrownBy(() -> parseur.extractSexe(nir))
                .isInstanceOf(NumeroSecuSocialException.class)
                .hasMessage("Code Sexe non valide !!");
    }
}
