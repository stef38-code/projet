package org.hussard.business.tools.nss;

/**
 * <strong>Composition du NIR (numéro d'inscription au répertoire) communément appelé numéro de sécurité sociale ou numéro INSEE</strong>
 * 		<table>
 * 			<tr style="background-color:silver;">
 * 				<th style="width:70px;">Position</th>
 * 				<th style="width:400px;">Composition</th>
 * 				<th>Valeurs possibles</th>
 * 			</tr>
 * <!-- Pour les français -->
 * <p>
 * 			<tr style="background-color:#DDDDDD;">
 * 				<th colspan="3">Pour les francais</th>
 * 			</tr>
 * 			<tr>  <!-- 1er chiffre du NIR-->
 * 				<td>1</td>
 * 				<td><strong>Sexe de la personne</strong></td>
 * 				<td><strong>1</strong> pour les hommes et <strong>2</strong> pour les femmes</td>
 * 			</tr>
 * 			<tr>  <!-- 2 et 3ième chiffres du NIR-->
 * 				<td>2 - 3</td>
 * 				<td><strong>Année de naissance</strong></td>
 * 				<td>De <strong>00 à 99</strong> soit les 2 derniers chiffres de l'année de naissance <em>(peut poser des problèmes de doublon)</em></td>
 * 			</tr>
 * 			<tr>  <!-- 4 et 5 ième chiffres du NIR-->
 * 				<td>4 - 5</td>
 * 				<td><strong>Mois de naissance</strong></td>
 * 				<td>De <strong>01 à 12</strong> <em>(on peut trouver des numéro de 20 à 30 ou 50 pour des personnes inscrites à partir d'un acte civil incomplet)</em></td>
 * 			</tr>
 * 			<tr>  <!-- 6 et 7 ième chiffres du NIR-->
 * 				<td>6 - 7 (- 8)</td>
 * 				<td><strong>Département de naissance</strong></td>
 * 				<td>De <strong>01 à 95</strong> et de <strong>971 à 988</strong> pour les DOM-COM <em>(pour la corse on remplace 2A par 19 et 2B par 18)</em></td>
 * 			</tr>
 * 			<tr>  <!-- 8 - 9 - 10 ième chiffres du NIR-->
 * 				<td>(8 -) 9 - 10</td>
 * 				<td><strong>Numéro de la commune de naissance</strong></td>
 * 				<td>De <strong>00 à 999</strong> <em>(les villes sont normalement numérotées par département et par ordre alphabétique et codifié en référence au code officiel géographique (COG) tenu par l'INSEE pour chaque département. Les villes nouvellement créées commencent souvent par 900)</em></td>
 * 			</tr>
 * 			<tr>  <!-- 11 - 12 - 13 ième chiffres du NIR-->
 * 				<td>11 - 12 - 13</td>
 * 				<td><strong>Numéro d'ordre de l'acte de naissance dans la commune et dans le mois</strong></td>
 * 				<td>De <strong>000 à 999</strong> <em>(peut poser un problème dans les grandes villes, lorsque 999 personnes sont nées le même mois dans la commune, le numéro d'ordre redemarre à 001 et le code commune prend une valeur particulière.)</em></td>
 * 			</tr>
 * 			<tr>  <!-- 14 - 15 ième chiffres du NIR-->
 * 				<td>14 - 15</td>
 * 				<td><strong>Clé de contrôle du NIR</strong></td>
 * 				<td>De <strong>01 à 97</strong> : 97 - modulo97(13 premiers chiffres du NIR)</td>
 * 			</tr>
 * <p>
 * <!-- Pour les étrangers -->
 * 			<tr style="background-color:#DDDDDD;">
 * 				<th colspan="3">Pour les étrangers</th>
 * 			</tr>
 * 			<tr>  <!-- 1er chiffre du NIR-->
 * 				<td>1</td>
 * 				<td><strong>Sexe de la personne</strong></td>
 * 				<td><strong>1</strong> pour les hommes et <strong>2</strong> pour les femmes</td>
 * 			</tr>
 * 			<tr>  <!-- 2 et 3ième chiffres du NIR-->
 * 				<td>2 - 3</td>
 * 				<td><strong>Année de naissance</strong></td>
 * 				<td>De <strong>00 à 99</strong> soit les 2 derniers chiffres de l'année de naissance <em>(peut poser des problèmes de doublon)</em></td>
 * 			</tr>
 * 			<tr>  <!-- 4 et 5 ième chiffres du NIR-->
 * 				<td>4 - 5</td>
 * 				<td><strong>Mois de naissance</strong></td>
 * 				<td>De <strong>01 à 12</strong> <em>(on peut trouver des numéro de 20 à 30 ou 50 pour des personnes inscrites à partir d'un acte civil incomplet)</em></td>
 * 			</tr>
 * 			<tr>  <!-- 6 et 7 ième chiffres du NIR-->
 * 				<td>6 - 7</td>
 * 				<td><strong>Numéro automatique</strong></td>
 * 				<td>
 * 					<strong>99</strong> par défaut <em>(peut poser des problèmes de doublon)</em><br/>
 * 					Pour les personnes nées en Algérie avant juillet 1962 le code 99 est remplacé par <strong>91, 92, 93 ou 94</strong>,
 * 					pour celles nées au Maroc avant 1964 il est remplacé par <strong>95</strong> et pour celles nées en Tunisie avant 1964 il est remplacé par <strong>96</strong>.
 * 					<em>Les départements actuels de 91 à 96 n'existaient pas avant 1964.</em>
 * 				</td>
 * 			</tr>
 * 			<tr>  <!-- 8 - 9 - 10 ième chiffres du NIR-->
 * 				<td>8 - 9 - 10</td>
 * 				<td><strong>Identifiant du pays de naissance</strong></td>
 * 				<td>De <strong>000 à 990</strong> <em>(ex. : 109 pour l'Allemagne)</em></td>
 * 			</tr>
 * 			<tr>  <!-- 11 - 12 - 13 ième chiffres du NIR-->
 * 				<td>11 - 12 - 13</td>
 * 				<td><strong>Numéro d'ordre de l'acte de naissance dans le pays et dans le mois</strong></td>
 * 				<td>De <strong>000 à 999</strong></td>
 * 			</tr>
 * 			<tr>  <!-- 14 - 15 ième chiffres du NIR-->
 * 				<td>14 - 15</td>
 * 				<td><strong>Clé de contrôle du NIR</strong></td>
 * 				<td>De <strong>01 à 97</strong> : 97 - modulo97(13 premiers chiffres du NIR)</td>
 * 			</tr>
 * 		</table>
 *
 * 		<strong>Problème des lettres dans le NIR</strong>
 * 		<p style="margin: 5px 20px 10px;">
 * 			Pour le calcul de la clé de contrôle, le numéro du département 2A (Corse-du-Sud) est remplacé par 19 et celui du 2B (Haute-Corse) par 18.
 * 		</p>
 */
public class NumeroSecuSocial extends NumeroSecuSocialCorse{
    /**
     * Check size equal 15
     * @param nss numéro de sécurité social
     * @return true si ok
     */
    public boolean isSize(String nss) {
        return cleanNss(nss).length() == 15;
    }


    /**
     * Is valide key boolean.
     *
     * @param nss the nss
     * @return the boolean
     */
    public boolean isValideKey(String nss) {
        if(! isSize(nss)){
            return false;
        }
        String cleanNss = cleanNss(nss);

        return (97 - (nssNumber(cleanNss) % 97)) == keyNumber(cleanNss);
    }

    private String cleanNss(String nss){
        String cleanNss =  nss.replace(" ", "");
        return casCorse(cleanNss);
    }
    private long nssNumber(String nss){
        String value = nss.substring(0,13);
        return Long.parseLong(value);
    }
    private long keyNumber(String nss){
        String key = nss.substring(13);
        return Long.parseLong(key);
    }
}
