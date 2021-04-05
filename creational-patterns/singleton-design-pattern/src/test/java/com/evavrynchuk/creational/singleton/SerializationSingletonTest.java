package com.evavrynchuk.creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;

class SerializationSingletonTest {

    private static final String FILE_NAME = "serializationSingleton.ser";

    @Test
    public void testGetInstance() throws Exception {
        SerializationSingleton firstInstance = SerializationSingleton.getInstance();

        try (ObjectOutput output = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            output.writeObject(firstInstance);

        }

        SerializationSingleton secondInstance;
        try (ObjectInput input = new ObjectInputStream(new FileInputStream(FILE_NAME))){
            secondInstance = (SerializationSingleton) input.readObject();
        }

        Assertions.assertEquals(firstInstance.hashCode(), secondInstance.hashCode());

    }

}