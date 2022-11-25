package org.hussard.business.tools.nss.elements.ordre;

import org.hussard.business.tools.nss.NumeroSecuSocialTools;
import org.hussard.business.tools.nss.elements.Element;

public class Ordre implements Element {
    @Override
    public String value(String nir) {
        return NumeroSecuSocialTools.cleanNss(nir).substring(10, 13);
    }
}
