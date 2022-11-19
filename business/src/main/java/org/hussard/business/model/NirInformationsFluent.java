package org.hussard.business.model;

public interface NirInformationsFluent {
    AnneeNaiss sexe(String sexe);
    interface AnneeNaiss {
        MoisNais  anneeNaiss(String anneeNaiss);
    }
    interface MoisNais {
        DepartementNaiss moisNais(String moisNais);
    }
    interface DepartementNaiss {
        NumCommuneNaiss departementNaiss(String departementNaiss);
    }
    interface NumCommuneNaiss {
        NumOrdreNaiss numCommuneNaiss(String numCommuneNaiss);
    }
    interface NumOrdreNaiss {
        CleCtrNir numOrdreNaiss(String numOrdreNaiss);
    }
    interface CleCtrNir {
        Create cleCtrNir(String cleCtrNir);
    }
    interface Create{
        NirInformations create();
    }
}
