package org.hussard.business.tools.nss.lieu;

import org.apache.commons.lang3.StringUtils;

public class Factory {
    public static LieuNaissance getLieu(String nir) {
        String lieu = nir.substring(5, 7);
        if (lieu.equals("99")) {
            return new HorsFrance(nir);
        }
        if (StringUtils.containsAny(lieu, "97", "98")) {
            return new OutreMer(nir);
        }
        return new Metropole(nir);
    }
}
