package com.damon.callable_future;

import java.util.concurrent.Callable;

public class DemoCallable implements Callable<String> {
    public String call() throws Exception {
        System.out.println("DemoCallable running");
        return "DemoCallable msg";
    }
}
