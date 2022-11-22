package org.hussard.business.tools.nss.annee;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Annee {
    public static String get(String nir) {
        String annee = nir.substring(1, 3);

        String century = getCentury();
        String year = getYear();
        if (Integer.parseInt(annee) > Integer.parseInt(year)) {
            century = String.valueOf(Integer.parseInt(century) - 1);
        }
        return century.concat(annee);
    }

    private static String getYear() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy")).substring(2);
    }

    private static String getCentury() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy")).substring(0, 2);
    }
}
