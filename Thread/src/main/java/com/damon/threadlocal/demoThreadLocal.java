package com.damon.threadlocal;

public class demoThreadLocal {
    private static ThreadLocal<String> threadLocal = new ThreadLocal<String>();

    public static void setThreadLocal(String str){
        threadLocal.set(str);
    }

    public static String getThreadLocal(){
        return threadLocal.get();
    }
}
