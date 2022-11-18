package org.hussard.business.tools.nss;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumeroSecuSocialCorse {
    private String correctionCorse(String cleanNss, String codeCorse, String value) {
        Pattern pattern = Pattern.compile("((.*)" + codeCorse + "(.*))");
        Matcher matcher = pattern.matcher(cleanNss);
        if(matcher.matches()) {
            return matcher.replaceAll("$2" + value + "$4");
        }
        return cleanNss;
    }

    protected String casCorse(String nss){
        //2A (Corse-du-Sud) est remplacé par 19
        String corrigeNss = correctionCorse(nss, "(2A)", "19");
        //2B (Haute-Corse) est remplacé par 18
        corrigeNss = correctionCorse(corrigeNss, "(2B)", "18");
        return corrigeNss;
    }
}
