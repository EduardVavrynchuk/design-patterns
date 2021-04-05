package com.evavrynchuk.creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadSafeSingletonTest {

    public static final String firstValue = "FIRST VALUE";
    public static final String secondValue = "SECOND VALUE";

    @Test
    public void testGetInstance() throws Exception {
        FirstCreate firstCreate = new FirstCreate();
        SecondCreate secondCreate = new SecondCreate();

        ExecutorService executor = Executors.newWorkStealingPool();

        executor.invokeAll(Arrays.asList(firstCreate, secondCreate))
                .stream()
                .map(future -> {
                    try {
                        return future.get();
                    }
                    catch (Exception e) {
                        throw new IllegalStateException(e);
                    }
                })
                .forEach(object -> Assertions.assertEquals(secondValue, object.getValue()));
    }

    private static class FirstCreate implements Callable<ThreadSafeSingleton> {

        @Override
        public ThreadSafeSingleton call() throws Exception {
            return ThreadSafeSingleton.getInstance(firstValue);
        }
    }

    private static class SecondCreate implements Callable<ThreadSafeSingleton> {

        @Override
        public ThreadSafeSingleton call() throws Exception{
            return ThreadSafeSingleton.getInstance(secondValue);
        }
    }

}