package org.hussard.business.tools.nss.elements.lieu;

import org.hussard.business.tools.nss.elements.Element;
import org.hussard.business.tools.nss.elements.lieu.regles.LieuNaissance;
import org.hussard.business.tools.nss.elements.lieu.regles.ReglesFactory;

public class Code implements Element {
    @Override
    public String value(String nir) {
        LieuNaissance lieu = ReglesFactory.getLieu(nir);
        return lieu.getCode();
    }
}
