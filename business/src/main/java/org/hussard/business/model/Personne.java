package org.hussard.business.model;

import java.time.LocalDate;

public class Personne {
    private final String nom;
    private final String prenom;
    private final LocalDate dnaiss;
    private final String numSS;

    Personne(String nom, String prenom, LocalDate dnaiss, String numSS) {
        this.nom = nom;
        this.prenom = prenom;
        this.dnaiss = dnaiss;
        this.numSS = numSS;
    }

    public static PersonneFluent aNew() {
        return new PersonneCreate();
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public LocalDate getDnaiss() {
        return dnaiss;
    }

    public String getNumSS() {
        return numSS;
    }
}
