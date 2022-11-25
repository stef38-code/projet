package org.hussard.business.tools.nss;

public class NumeroSecuSocialTools extends NumeroSecuSocialCorse {
    private NumeroSecuSocialTools() {
       super();
    }
    /**
     * Check size equal 15
     *
     * @param noFormatedNss numéro de sécurité social sans espaces
     * @return true si ok
     */
    public static boolean isSize(String noFormatedNss) {
        return cleanNss(noFormatedNss).length() == 15;
    }

    public static String cleanNss(String nss) {
        return nss.replace(" ", "");
    }
    public static String cleanNssAndCorseCase(String nss) {
        return casCorse(cleanNss(nss));
    }
    private static long extractNssNumber(String nss) {
        String value = nss.substring(0, 13);
        return Long.parseLong(value);
    }

    private static long extractNsskeyValue(String nss) {
        String key = nss.substring(13);
        return Long.parseLong(key);
    }

    private static long modulo(String noFormatedNss, int moduloValue) {
        return extractNssNumber(noFormatedNss) % moduloValue;
    }

    public static boolean isValidateKey(String nir) {
        String noFormatedNss = cleanNssAndCorseCase(nir);
        return (97 - modulo(noFormatedNss, 97)) == extractNsskeyValue(noFormatedNss);
    }

}
