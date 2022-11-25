package org.hussard.business.tools.nss.elements.mois;

import org.hussard.business.tools.nss.NumeroSecuSocialException;
import org.hussard.business.tools.nss.NumeroSecuSocialTools;
import org.hussard.business.tools.nss.elements.Element;

/**
 * 4 et 5 	mois de naissance
 * de 01 (janvier) à 12 (décembre)
 * ou entre 20 et 42
 * ou entre 50 et 99
 * <p>
 * Des codes spécifiques existent pour les personnes inscrites à partir d'un acte d'état civil incomplet.
 * Les mois de naissance fictifs 20 à 30 ou 50 ou plus caractérisent le NIR d'une personne inscrite
 * sur la base d'une pièce d'état civil ne précisant pas le mois de naissance.
 * Les mois de naissance dits « pseudo-fictifs », de 31 (janvier) à 42 (décembre),
 * caractérisent le NIR d'une personne inscrite sur la base d'une pièce d'état civil incomplète,
 * mais mentionnant toutefois un mois de naissance.
 */
public class Mois implements Element {

    private static boolean isMonthValidated(String mois) {
        int month = Integer.parseInt(mois);
        return critere(month, 1, 12) || critere(month, 20, 42) || critere(month, 50, 99);
    }

    private static boolean critere(int mois, int debut, int fin) {
        return (mois >= debut && mois <= fin);
    }

    @Override
    public String value(String nir) {
         String mois =  NumeroSecuSocialTools.cleanNss(nir).substring(3, 5);
        if (isMonthValidated(mois)) {
            return mois;
        }
        throw new NumeroSecuSocialException("Mois de naissance non conforme !!");
    }
}
