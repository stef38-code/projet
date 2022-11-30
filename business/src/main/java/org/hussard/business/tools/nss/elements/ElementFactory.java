package org.hussard.business.tools.nss.elements;

/**
 * The type Element factory.
 */
public class ElementFactory {
    /**
     * Instantiates a new Element factory.
     */
    private ElementFactory() {
        throw new UnsupportedOperationException("ElementFactory is a utility class and cannot be instantiated");
    }

    /**
     * Get element.
     *
     * @param enumElement the enum element
     * @return the new instance element
     */
    public static Element get(EnumElement enumElement) {
        return enumElement.getInstance();
    }
}
