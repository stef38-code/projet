package org.hussard.business.tools.nss.elements.lieu.regles;

public class Metropole extends LieuNaissance {
    public Metropole(String nir) {
        super(nir);
    }

    @Override
    public String getCode() {
        return getNir().substring(5, 7);
    }

    @Override
    public String getNumero() {
        return getNir().substring(7, 10);
    }
}
