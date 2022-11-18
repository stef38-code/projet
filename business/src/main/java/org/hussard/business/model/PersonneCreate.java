package org.hussard.business.model;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;

public class PersonneCreate implements PersonneFluent, PersonneFluent.Prenom, PersonneFluent.Dnaiss, PersonneFluent.NumSS, PersonneFluent.Create {
    private String nom;
    private String prenom;
    private LocalDate dnaiss;
    private String numSS;

    @Override
    public PersonneCreate nom(String nom) {
        this.nom = nom;
        return this;
    }

    @Override
    public PersonneCreate prenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    @Override
    public PersonneCreate dnaiss(LocalDate dnaiss) {
        this.dnaiss = dnaiss;
        return this;
    }

    @Override
    public PersonneCreate numSS(String numSS) {
        this.numSS = numSS;
        return this;
    }

    @Override
    public PersonneCreate notNumSS() {
        this.numSS = StringUtils.EMPTY;
        return this;
    }

    @Override
    public Personne create() {
        return new Personne(nom, prenom, dnaiss, numSS);
    }
}
