package com.damon.runnable;

public class Main {
    public static void main(String[] args){
        Thread thread = new Thread(new demoRunnable());
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Test without join()");
    }
}
