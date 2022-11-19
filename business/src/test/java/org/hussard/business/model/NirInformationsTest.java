package org.hussard.business.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NirInformationsTest {

    @Test
    void aNew() {
        NirInformations nirInformations = NirInformations.aNew()
                .sexe("1")
                .anneeNaiss("00")
                .moisNais("03")
                .departementNaiss("2B")
                .numCommuneNaiss("145")
                .numOrdreNaiss("256")
                .cleCtrNir("14")
                .create();
        assertThat(nirInformations.getSexe()).isEqualTo("1");
        assertThat(nirInformations.getAnneeNaiss()).isEqualTo("00");
        assertThat(nirInformations.getMoisNais()).isEqualTo("03");
        assertThat(nirInformations.getDepartementNaiss()).isEqualTo("2B");
        assertThat(nirInformations.getNumCommuneNaiss()).isEqualTo("145");
        assertThat(nirInformations.getNumOrdreNaiss()).isEqualTo("256");
        assertThat(nirInformations.getCleCtrNir()).isEqualTo("14");


    }
}
