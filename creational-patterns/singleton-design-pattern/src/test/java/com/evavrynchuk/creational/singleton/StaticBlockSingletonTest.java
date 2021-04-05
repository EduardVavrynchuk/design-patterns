package com.evavrynchuk.creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StaticBlockSingletonTest {

    @Test
    public void testGetInstance() {
        StaticBlockSingleton firstInstance = StaticBlockSingleton.getInstance();
        StaticBlockSingleton secondInstance = StaticBlockSingleton.getInstance();

        Assertions.assertEquals(firstInstance.getValue(), secondInstance.getValue());
    }
}