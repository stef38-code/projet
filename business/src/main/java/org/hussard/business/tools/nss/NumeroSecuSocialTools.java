package org.hussard.business.tools.nss;

class NumeroSecuSocialTools extends NumeroSecuSocialCorse{
    /**
     * Check size equal 15
     * @param noFormatedNss numéro de sécurité social sans espaces
     * @return true si ok
     */
    protected boolean isSize(String noFormatedNss) {
        return noFormatedNss.length() == 15;
    }

    protected String cleanNss(String nss){
        String cleanNss =  nss.replace(" ", "");
        return casCorse(cleanNss);
    }

    private long extractNssNumber(String nss){
        String value = nss.substring(0,13);
        return Long.parseLong(value);
    }

    protected long extractNsskeyValue(String nss){
        String key = nss.substring(13);
        return Long.parseLong(key);
    }

    protected long modulo(String noFormatedNss, int moduloValue) {
        return extractNssNumber(noFormatedNss) % moduloValue;
    }

    protected boolean isValidateKey(String noFormatedNss) {
        return (97 - modulo(noFormatedNss, 97)) == extractNsskeyValue(noFormatedNss);
    }
}
