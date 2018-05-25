package com.damon.threadlocal;

public class Thread1 implements Runnable {
    public void run() {
        demoThreadLocal.setThreadLocal("Thread1");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(demoThreadLocal.getThreadLocal());
    }
}
