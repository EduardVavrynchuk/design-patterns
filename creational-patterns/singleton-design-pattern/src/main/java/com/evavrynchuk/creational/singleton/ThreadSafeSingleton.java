package com.evavrynchuk.creational.singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;
    private String value;

    private ThreadSafeSingleton(String value) {
        this.value = value;
    }

    public static synchronized ThreadSafeSingleton getInstance(String value) throws InterruptedException {
        if (instance == null) {
            Thread.sleep(1000);
            instance = new ThreadSafeSingleton(value);
        }

        return instance;
    }

    public static ThreadSafeSingleton getDualLockingInstance(String value) {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton(value);
                }
            }
        }

        return instance;
    }

    public String getValue() {
        return value;
    }
}
