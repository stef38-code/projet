package org.hussard.business.model;

import java.time.LocalDate;

public interface PersonneFluent {
    Prenom nom(String nom);
    interface Prenom{
        Dnaiss prenom(String prenom);
    }
    interface Dnaiss{
        Create dnaiss(LocalDate dnaiss);
    }
    interface Create{
        Personne create();
    }
}
