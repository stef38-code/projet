package org.hussard.business.tools.nss.elements;

import org.hussard.business.tools.nss.elements.annee.Annee;
import org.hussard.business.tools.nss.elements.cle.Cle;
import org.hussard.business.tools.nss.elements.lieu.Code;
import org.hussard.business.tools.nss.elements.lieu.Numero;
import org.hussard.business.tools.nss.elements.mois.Mois;
import org.hussard.business.tools.nss.elements.ordre.Ordre;
import org.hussard.business.tools.nss.elements.sexe.Sexe;

import java.util.function.Supplier;

/**
 * The enum Enum element.
 */
public enum EnumElement {
    /**
     * Sexe enum element.
     */
    SEXE(Sexe::new),
    /**
     * Annee enum element.
     */
    ANNEE(Annee::new),
    /**
     * Mois enum element.
     */
    MOIS(Mois::new),
    /**
     * Code enum element.
     */
    CODE(Code::new),
    /**
     * Numero enum element.
     */
    NUMERO(Numero::new),
    /**
     * Ordre enum element.
     */
    ORDRE(Ordre::new),
    /**
     * Cle enum element.
     */
    CLE(Cle::new);

    /**
     * The Instantiator.
     */
    private final Supplier<Element> instantiator;

    /**
     * Instantiates a new Enum element.
     *
     * @param instantiator the instantiator
     */
    EnumElement(Supplier<Element> instantiator) {
        this.instantiator = instantiator;
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public Element getInstance() {
        return instantiator.get();
    }
}
