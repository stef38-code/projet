package org.hussard.business.tools.nss;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The type Numero secu social corse.
 */
class NumeroSecuSocialCorse {
    NumeroSecuSocialCorse() {
        throw new UnsupportedOperationException("Utility class and cannot be instantiated");
    }

    /**
     * Correction corse string.
     *
     * @param cleanNss  the clean nss
     * @param codeCorse the code corse
     * @param value     the value
     * @return string si la chaîne contient les codes Corse
     */
    private static String correctionCorse(String cleanNss, String codeCorse, String value) {
        Pattern pattern = Pattern.compile("((.*)(" + codeCorse + ")(.*))");
        Matcher matcher = pattern.matcher(cleanNss);
        if (matcher.matches()) {
            return matcher.replaceAll("$2" + value + "$4");
        }
        return cleanNss;
    }

    /**
     * Cas corse string.
     *
     * @param nss the nss
     * @return the string
     */
    protected static String casCorse(String nss) {
        //2A (Corse-du-Sud) est remplacé par 19
        String corrigeNss = correctionCorse(nss, "2A", "19");
        //2B (Haute-Corse) est remplacé par 18
        corrigeNss = correctionCorse(corrigeNss, "2B", "18");
        return corrigeNss;
    }
}
