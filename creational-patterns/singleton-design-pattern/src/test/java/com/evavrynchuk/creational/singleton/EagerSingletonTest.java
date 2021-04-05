package com.evavrynchuk.creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EagerSingletonTest {

    @Test
    public void testGetInstance() {
        EagerSingleton firstInstance = EagerSingleton.getInstance();
        EagerSingleton secondInstance = EagerSingleton.getInstance();

        Assertions.assertEquals(firstInstance.getValue(), secondInstance.getValue());
    }

}