package com.damon.simpleRMI;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) throws Exception{
        HelloService helloService = new HelloServiceImpl();
        LocateRegistry.createRegistry(8801);
        Naming.bind("rmi://localhost:8801/helloService", helloService);
        System.out.println("RMI Server provide helloService");
    }
}
