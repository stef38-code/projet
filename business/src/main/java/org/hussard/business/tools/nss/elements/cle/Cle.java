package org.hussard.business.tools.nss.elements.cle;

import org.hussard.business.tools.nss.NumeroSecuSocialTools;
import org.hussard.business.tools.nss.elements.Element;

public class Cle implements Element {
    @Override
    public String value(String nir) {
        return NumeroSecuSocialTools.cleanNss(nir).substring(13);
    }
}
