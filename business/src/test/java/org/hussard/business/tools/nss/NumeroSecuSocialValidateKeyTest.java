package org.hussard.business.tools.nss;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
@DisplayName("Test la validation de la clef du nss")
class NumeroSecuSocialValidateKeyTest {
    @ParameterizedTest(name = "numero securité: {0} résulat attendu: {1}")
    @CsvFileSource(resources = "/nss.csv")
    void isValideKey(String nss, boolean resultat) {
        NumeroSecuSocial numeroSecuSocial = new NumeroSecuSocial();
        Assertions.assertThat(numeroSecuSocial.isValideKey(nss)).isEqualTo(resultat);
    }


}
