package org.hussard.business.tools.nss.lieu;

public class HorsFrance extends LieuNaissance {
    public HorsFrance(String nir) {
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
