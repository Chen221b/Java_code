package com.damon.wait_notify;

/*wait()会释放对象锁，将线程挂起，直到其他线程获得该锁并使用notify()通知
* 线程才有可能获取该锁，继续执行*/
public class Main {
    public static void main(String[] args){
        Condition.flag = true;
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        thread1.start();
        thread2.start();

    }
}
