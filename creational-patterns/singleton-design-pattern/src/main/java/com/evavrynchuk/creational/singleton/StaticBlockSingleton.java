package com.evavrynchuk.creational.singleton;

public class StaticBlockSingleton {

    public static final String STATIC_BLOCK_VALUE = "STATIC BLOCK SINGLETON";

    private static final StaticBlockSingleton instance;
    private final String value;

    private StaticBlockSingleton(String value) {
        this.value = value;
    }

    static {
        try {
            instance = new StaticBlockSingleton(STATIC_BLOCK_VALUE);
        } catch (Exception e) {
            throw new RuntimeException("Error while creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

    public String getValue() {
        return value;
    }
}
