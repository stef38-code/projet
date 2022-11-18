package org.hussard.business.tools.nss;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
@DisplayName("Test la validation du nombre de caractères du nss")
class NumeroSecuSocialCheckSizeTest {
    @ParameterizedTest(name = "numero securité: {0} résulat attendu: {1}")
    @CsvFileSource(resources = "/nssSize.csv")
    void isValide(String nss, boolean resultat) {
        NumeroSecuSocial numeroSecuSocial = new NumeroSecuSocial();
        Assertions.assertThat(numeroSecuSocial.isSize(nss)).isEqualTo(resultat);
    }


}
