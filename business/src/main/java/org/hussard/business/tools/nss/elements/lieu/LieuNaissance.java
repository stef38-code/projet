package org.hussard.business.tools.nss.elements.lieu;

import org.hussard.business.tools.nss.NumeroSecuSocialTools;

public abstract class LieuNaissance {
    private final String nir;

    protected LieuNaissance(String nir) {
        this.nir = nir;
    }

    public String getNir() {
        return NumeroSecuSocialTools.cleanNss(nir);
    }

    public abstract String getCode();

    public abstract String getNumero();
}
