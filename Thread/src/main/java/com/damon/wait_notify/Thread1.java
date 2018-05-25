package com.damon.wait_notify;

public class Thread1 implements Runnable {
    public void run() {
        synchronized(DemoLock.class){
            System.out.println("Thread1 wait");
            while(Condition.flag){
                try {
                    DemoLock.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Thread1 get lock");
        }
    }
}
