package com.damon.myRPC.server;

public class Server {
    public static void main(String[] args){
        HelloService helloService = new HelloServiceImpl();
        try {
            ProviderReflect.provider(helloService, 8083);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
