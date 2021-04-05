package com.evavrynchuk.creational.singleton;

public class EagerSingleton {

    public static final String SINGLETON_VALUE = "EAGER SINGLETON";

    private static final EagerSingleton eagerInstance = new EagerSingleton();
    private final String value;

    private EagerSingleton() {
        this.value = SINGLETON_VALUE;
    }

    public static EagerSingleton getInstance() {
        return eagerInstance;
    }

    public String getValue() {
        return value;
    }
}
