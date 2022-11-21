package org.hussard.business.tools.nss.lieu;

public abstract class LieuNaissance {
    private final String nir;

    protected LieuNaissance(String nir) {
        this.nir = nir;
    }

    public abstract String getCode();

    public abstract String getNumero();
}
