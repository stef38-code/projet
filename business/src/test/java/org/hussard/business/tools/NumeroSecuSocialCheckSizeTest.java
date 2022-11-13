package org.hussard.business.tools;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

class NumeroSecuSocialCheckSizeTest {
    private static Stream<Arguments> generateDataTest() {
        List<Arguments> listOfArguments = new LinkedList<>();
        listOfArguments.add(Arguments.of("255081416802538", true));
        listOfArguments.add(Arguments.of("2 55 08 14 168 025 38", true));
        listOfArguments.add(Arguments.of("186069305102313", true));
        listOfArguments.add(Arguments.of("1 86 06 93 051 023 13", true));
        listOfArguments.add(Arguments.of("286129147102722", true));
        listOfArguments.add(Arguments.of("2380778018086", false));
        listOfArguments.add(Arguments.of("2550814168025", false));
        listOfArguments.add(Arguments.of("2 55 08 14 168 025", false));
        return listOfArguments.stream();
    }

    @ParameterizedTest(name = "numero securité: {0} check: {1}")
    @MethodSource("generateDataTest")
    void isValide(String nss, boolean resultat) {
        NumeroSecuSocial numeroSecuSocial = new NumeroSecuSocial();
        Assertions.assertThat(numeroSecuSocial.isValide(nss)).isEqualTo(resultat);
    }


}
