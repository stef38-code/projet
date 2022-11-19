package org.hussard.business.model;

public class NirInformations {
    //position 1
    private final String sexe;
    //position 2 - 3
    private final String anneeNaiss;
    //poistion 4 - 5
    private final String moisNais;
    // position 6 - 7 (- 8)
    private final String departementNaiss;
    // position (8 -) 9 - 10
    private final String numCommuneNaiss;
    // position 11 - 12 - 13
    private final String numOrdreNaiss;
    // position 14 - 15
    private final String cleCtrNir;

    NirInformations(String sexe, String anneeNaiss, String moisNais, String departementNaiss, String numCommuneNaiss, String numOrdreNaiss, String cleCtrNir) {
        this.sexe = sexe;
        this.anneeNaiss = anneeNaiss;
        this.moisNais = moisNais;
        this.departementNaiss = departementNaiss;
        this.numCommuneNaiss = numCommuneNaiss;
        this.numOrdreNaiss = numOrdreNaiss;
        this.cleCtrNir = cleCtrNir;
    }
    public static NirInformationsFluent aNew(){
        return new NirInformationsCreate();
    }

    public String getSexe() {
        return sexe;
    }

    public String getAnneeNaiss() {
        return anneeNaiss;
    }

    public String getMoisNais() {
        return moisNais;
    }

    public String getDepartementNaiss() {
        return departementNaiss;
    }

    public String getNumCommuneNaiss() {
        return numCommuneNaiss;
    }

    public String getNumOrdreNaiss() {
        return numOrdreNaiss;
    }

    public String getCleCtrNir() {
        return cleCtrNir;
    }
}
