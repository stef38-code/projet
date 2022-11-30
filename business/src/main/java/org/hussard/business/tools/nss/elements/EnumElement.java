package org.hussard.business.tools.nss.elements;

import org.hussard.business.tools.nss.elements.annee.Annee;
import org.hussard.business.tools.nss.elements.cle.Cle;
import org.hussard.business.tools.nss.elements.lieu.Code;
import org.hussard.business.tools.nss.elements.lieu.Numero;
import org.hussard.business.tools.nss.elements.mois.Mois;
import org.hussard.business.tools.nss.elements.ordre.Ordre;
import org.hussard.business.tools.nss.elements.sexe.Sexe;

import java.util.function.Supplier;

public enum EnumElement {
    SEXE(Sexe::new),
    ANNEE(Annee::new),
    MOIS(Mois::new),
    CODE(Code::new),
    NUMERO(Numero::new),
    ORDRE(Ordre::new),
    CLE(Cle::new);

    private final Supplier<Element> instantiator;

    EnumElement(Supplier<Element> instantiator) {
        this.instantiator = instantiator;
    }

    public Element getInstance() {
        return instantiator.get();
    }
}
