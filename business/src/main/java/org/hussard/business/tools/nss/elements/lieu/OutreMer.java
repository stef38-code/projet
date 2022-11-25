package org.hussard.business.tools.nss.elements.lieu;

public class OutreMer extends LieuNaissance {
    public OutreMer(String nir) {
        super(nir);
    }

    @Override
    public String getCode() {
        return getNir().substring(5, 8);
    }

    @Override
    public String getNumero() {
        return getNir().substring(8, 10);
    }
}
