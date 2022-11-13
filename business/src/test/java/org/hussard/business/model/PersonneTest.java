package org.hussard.business.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class PersonneTest {
    @Test
    void create_Quand_NouvellePersonne_AttendUneNouvellePersonne() {
        Personne personne = Personne.aNew()
                .nom("Dupont").prenom("René")
                .dnaiss(LocalDate.now().minusYears(20))
                .notNumSS()
                .create();
        assertThat(personne).isNotNull();
        assertThat(personne.getNom()).hasToString("Dupont");
        assertThat(personne.getPrenom()).hasToString("René");
        assertThat(personne.getDnaiss()).isEqualTo(LocalDate.now().minusYears(20));
    }

    @Test
    void create_Quand_NumeroSS_Attent_UneNouvellePersonne() {
        Personne personne = Personne.aNew()
                .nom("Merlin")
                .prenom("Jeanne")
                .dnaiss(LocalDate.now().minusYears(35))
                .numSS("123")
                .create();
        assertThat(personne).isNotNull();
        assertThat(personne.getNom()).hasToString("Merlin");
        assertThat(personne.getPrenom()).hasToString("Jeanne");
        assertThat(personne.getNumSS()).hasToString("123");
        assertThat(personne.getDnaiss()).isEqualTo(LocalDate.now().minusYears(35));
    }
}
