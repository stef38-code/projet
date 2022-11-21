package org.hussard.business.tools.nss.sexe;

import org.hussard.business.tools.nss.NumeroSecuSocialException;

public class Sexe {
    public String get(String nir) {
        if (nir.matches("^([^1-4|78])(.*)$")) {
            throw new NumeroSecuSocialException("Code Sexe non valide !!");
        }
        return nir.substring(0, 1);
    }
}
