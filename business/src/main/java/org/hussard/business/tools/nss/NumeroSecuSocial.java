package org.hussard.business.tools.nss;

/**
 * <p>
 * Permet de valider un numéro de sécurité social
 * En contrôlant sa taille et la validitée de la clef de contrôle
 * </p>
 * <strong>
 *     Composition du NIR (numéro d'inscription au répertoire)
 * communément appelé numéro de sécurité sociale ou numéro INSEE
 * </strong>
 * <br>
 * <p>
 *     <strong>Taille de la chaîne de caractères</strong>
 *     <p style="margin: 5px 20px 10px;">
 *  Il est composé de 13 caractères + 2 pour la clef de contrôle
 *     </p>
 * </p>
 * <p>
 * 		<strong>Problème des lettres dans le NIR</strong>
 * 		<p style="margin: 5px 20px 10px;">
 * 			Pour le calcul de la clé de contrôle, le numéro du département 2A (Corse-du-Sud) est remplacé par 19 et celui du 2B (Haute-Corse) par 18.
 * 		</p>
 * 	</p>
 * <a href="https://fr.wikipedia.org/wiki/Num%C3%A9ro_de_s%C3%A9curit%C3%A9_sociale_en_France">wikipedia</a>
 */
public class NumeroSecuSocial extends NumeroSecuSocialTools{

    /**
     * Test la validitée d'un numéro de sécurité social.
     *
     * @param nss le numéro de sécurité social
     * @return true si nb carac. == 15 et la clef valide
     */
    public boolean isValidate(String nss) {
        String noFormatedNss = cleanNss(nss);
        if (isSize(noFormatedNss)) {
            return isValidateKey(noFormatedNss);
        }
        return false;
    }

}
