package org.hussard.business.model;

import java.time.LocalDate;

public class PersonneCreate implements PersonneFluent,PersonneFluent.Prenom,PersonneFluent.Dnaiss,PersonneFluent.Create{
    private  String nom;
    private  String prenom;
    private  LocalDate dnaiss;
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
    public Personne create() {
        return new Personne(nom,prenom,dnaiss);
    }
}
