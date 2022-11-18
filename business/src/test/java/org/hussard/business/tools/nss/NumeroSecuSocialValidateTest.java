package org.hussard.business.tools.nss;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class NumeroSecuSocialValidateTest {
    @ParameterizedTest(name = "numero securité: {0} résulat attendu: {1}")
    @CsvFileSource(resources = {"/nss.csv","/nssSize.csv"})
    void valide(String nss, boolean resultat) {
        NumeroSecuSocial numeroSecuSocial = new NumeroSecuSocial();
        Assertions.assertThat(numeroSecuSocial.isValidate(nss)).isEqualTo(resultat);
    }

}
