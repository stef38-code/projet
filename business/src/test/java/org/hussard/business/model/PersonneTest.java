package org.hussard.business.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class PersonneTest {
@Test
    void dev(){
    Personne personne = Personne.aNew().nom("Dupont").prenom("René").dnaiss(LocalDate.now().minusYears(20)).create();

    assertThat(personne).isNotNull();
    assertThat(personne.getNom()).hasToString("Dupont");
    assertThat(personne.getPrenom()).hasToString("René");
    assertThat(personne.getDnaiss()).isEqualTo(LocalDate.now().minusYears(20));
}
}
