package com.evavrynchuk.creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LazySingletonTest {

    @Test
    public void testGetInstance() {
        String firstValue = "FIRST VALUE FOR LAZY SINGLETON";
        String secondValue = "SECOND VALUE FOR LAZY SINGLETON";

        LazySingleton firstLazySingleton = LazySingleton.getInstance(firstValue);
        LazySingleton secondLazySingleton = LazySingleton.getInstance(secondValue);

        Assertions.assertEquals(firstValue, firstLazySingleton.getValue());
        Assertions.assertEquals(firstValue, secondLazySingleton.getValue());
    }

}