package com.evavrynchuk.creational.singleton;

public class LazySingleton {

    private static LazySingleton lazyInstance;
    private String value;

    private LazySingleton(String value) {
        this.value = value;
    }

    public static LazySingleton getInstance(String value) {
        if (lazyInstance == null) {
            lazyInstance = new LazySingleton(value);
        }

        return lazyInstance;
    }

    public String getValue() {
        return value;
    }
}
