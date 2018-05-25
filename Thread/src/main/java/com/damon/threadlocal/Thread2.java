package com.damon.threadlocal;

public class Thread2 implements Runnable {
    public void run() {
        demoThreadLocal.setThreadLocal("Thread2");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(demoThreadLocal.getThreadLocal());
    }
}
