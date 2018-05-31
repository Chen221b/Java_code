package com.damon.cxf;

import javax.jws.WebService;

@WebService
public interface HelloService {
    public String sayHello(String string);
}
