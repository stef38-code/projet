package org.hussard.business.tools.nss.elements;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class ElementFactoryTest {
    @Test
    void constructor() throws NoSuchMethodException {
        Constructor<ElementFactory> c = ElementFactory.class.getDeclaredConstructor();
        c.setAccessible(true);
        Assertions.assertThatThrownBy(c::newInstance)
                .isInstanceOf(InvocationTargetException.class);
    }
}
