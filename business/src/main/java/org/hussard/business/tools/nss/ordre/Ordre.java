package org.hussard.business.tools.nss.ordre;

public class Ordre {
    public static String get(String nir) {
        return nir.substring(10, 13);
    }
}
