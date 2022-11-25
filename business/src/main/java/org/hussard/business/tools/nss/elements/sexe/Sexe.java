package org.hussard.business.tools.nss.elements.sexe;

import org.hussard.business.tools.nss.NumeroSecuSocialException;
import org.hussard.business.tools.nss.NumeroSecuSocialTools;
import org.hussard.business.tools.nss.elements.Element;
public class Sexe implements Element{


    @Override
    public String value(String nir) {
        String cleanNir = NumeroSecuSocialTools.cleanNss(nir);
        if (cleanNir.matches("^([^1-4|7-8])(.*)$")) {
            throw new NumeroSecuSocialException("Code Sexe non valide !!");
        }
        return cleanNir.substring(0, 1);
    }
}
