package com.damon.thread;

public class Main {
    public static void main(String[] args){
        Thread thread = new demoThread();
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
