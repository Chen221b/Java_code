package com.damon.cxf;

import javax.jws.WebService;

@WebService(endpointInterface = "com.damon.cxf.HelloService")
public class HelloServiceImpl implements HelloService {
    public String sayHello(String string) {
        return "Hello " + string;
    }
}
