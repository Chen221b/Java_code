package com.damon.simpleRMI;

import java.rmi.Naming;

public class Client {
    public static void main(String[] args) throws Exception{
        HelloService helloService = (HelloService)Naming.lookup("rmi://localhost:8801/helloService");
        System.out.println("Result from Server: " + helloService.sayHello("Damon"));
    }
}
