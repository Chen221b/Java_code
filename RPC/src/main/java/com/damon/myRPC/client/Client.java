package com.damon.myRPC.client;

import com.damon.myRPC.server.HelloService;

public class Client {
    public static void main(String[] args){
        HelloService helloService = ConsumerProxy.consume(HelloService.class, "127.0.0.1", 8083);
        for(int i = 0; i < 10; i++){
            String hello = helloService.sayHello();
            System.out.println(hello);
        }
    }
}
