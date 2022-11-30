package org.hussard.business.tools.nss;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class NumeroSecuSocialToolsTest {
    @Test
    void constructor() throws NoSuchMethodException {
        Constructor<NumeroSecuSocialTools> c = NumeroSecuSocialTools.class.getDeclaredConstructor();
        c.setAccessible(true);
        Assertions.assertThatThrownBy(c::newInstance)
                .isInstanceOf(InvocationTargetException.class);
    }
}
