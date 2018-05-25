package com.damon.callable_future;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newScheduledThreadPool(5);
        Future<String> future = executorService.submit(new DemoCallable());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


        FutureTask<String> futureTask = new FutureTask<String>(new DemoCallable());
        executorService.submit(futureTask);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
