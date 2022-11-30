package org.hussard.business.tools.nss.elements.lieu.regles;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class ReglesFactoryTest {
    @Test
    void constructor() throws NoSuchMethodException {
        Constructor<ReglesFactory> c = ReglesFactory.class.getDeclaredConstructor();
        c.setAccessible(true);
        Assertions.assertThatThrownBy(c::newInstance)
                .isInstanceOf(InvocationTargetException.class);
    }
}
