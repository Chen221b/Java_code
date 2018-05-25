package com.damon.threadlocal;

/*ThreadLocal，即线程局部变量，是一个以ThreadLocal对象为键、任意对象为值的存储结构。
线程可以根据一个ThreadLocal对象查询到绑定在这个线程上的一个值。
实现方法区的线程私有。*/
public class Main {
    public static void main(String[] args){
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        thread1.start();
        thread2.start();

    }
}
