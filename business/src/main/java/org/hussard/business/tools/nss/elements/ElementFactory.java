package org.hussard.business.tools.nss.elements;

public class ElementFactory {
    private ElementFactory() {
        throw new UnsupportedOperationException("ElementFactory is a utility class and cannot be instantiated");
    }
    public static Element get(EnumElement enumElement){
        return enumElement.getInstance();
    }
}
