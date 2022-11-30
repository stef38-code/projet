package org.hussard.business.tools.nss.elements.lieu.regles;

import org.apache.commons.lang3.StringUtils;
import org.hussard.business.tools.nss.NumeroSecuSocialTools;

public class ReglesFactory {
    private ReglesFactory() {
        throw new UnsupportedOperationException("ReglesFactory is a utility class and cannot be instantiated");
    }

    public static LieuNaissance getLieu(String nir) {
        String lieu = NumeroSecuSocialTools.cleanNss(nir).substring(5, 7);
        if (lieu.equals("99")) {
            return new HorsFrance(nir);
        }
        if (StringUtils.containsAny(lieu, "97", "98")) {
            return new OutreMer(nir);
        }
        return new Metropole(nir);
    }
}
