package com.damon.wait_notify;

public class Thread2 implements Runnable {
    public void run() {
        synchronized (DemoLock.class){
            Condition.flag = false;
            DemoLock.class.notify();
            System.out.println("Thread2 get lock");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread2 release lock");
        }
    }
}
