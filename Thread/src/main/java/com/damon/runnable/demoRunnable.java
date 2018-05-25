package com.damon.runnable;

public class demoRunnable implements Runnable {
    public void run() {
        try {
            System.out.println("DemoRunnable Start");
            Thread.sleep(5000);
            System.out.println("DemoRunnable End");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
