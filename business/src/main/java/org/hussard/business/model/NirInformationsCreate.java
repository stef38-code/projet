package org.hussard.business.model;

public class NirInformationsCreate implements NirInformationsFluent,NirInformationsFluent.AnneeNaiss,NirInformationsFluent.MoisNais,NirInformationsFluent.DepartementNaiss,NirInformationsFluent.NumCommuneNaiss,NirInformationsFluent.NumOrdreNaiss,NirInformationsFluent.CleCtrNir,NirInformationsFluent.Create {
    //position 1
    private  String sexe;
    //position 2 - 3
    private  String anneeNaiss;
    //poistion 4 - 5
    private  String moisNais;
    // position 6 - 7 (- 8)
    private  String departementNaiss;
    // position (8 -) 9 - 10
    private  String numCommuneNaiss;
    // position 11 - 12 - 13
    private  String numOrdreNaiss;
    // position 14 - 15
    private  String cleCtrNir;
    @Override
    public NirInformationsCreate sexe(String sexe) {
        this.sexe =sexe;
        return this;
    }

    @Override
    public NirInformationsCreate anneeNaiss(String anneeNaiss) {
        this.anneeNaiss = anneeNaiss;
        return this;
    }

    @Override
    public NirInformationsCreate moisNais(String moisNais) {
        this.moisNais = moisNais;
        return this;
    }

    @Override
    public NirInformationsCreate departementNaiss(String departementNaiss) {
        this.departementNaiss = departementNaiss;
        return this;
    }

    @Override
    public NirInformationsCreate numCommuneNaiss(String numCommuneNaiss) {
        this.numCommuneNaiss = numCommuneNaiss;
        return this;
    }

    @Override
    public NirInformationsCreate numOrdreNaiss(String numOrdreNaiss) {
        this.numOrdreNaiss = numOrdreNaiss;
        return this;
    }

    @Override
    public NirInformationsCreate cleCtrNir(String cleCtrNir) {
        this.cleCtrNir = cleCtrNir;
        return this;
    }

    @Override
    public NirInformations create() {
        return new NirInformations( sexe,  anneeNaiss,  moisNais,  departementNaiss,  numCommuneNaiss,  numOrdreNaiss,  cleCtrNir);
    }
}
