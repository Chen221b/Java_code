package com.damon.simpleRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServiceImpl extends UnicastRemoteObject implements HelloService {

    private static final long serialVersionUID = -6190513770400890033L;

    public HelloServiceImpl() throws RemoteException{
        super();
    }

    public String sayHello(String someOne) throws RemoteException {
        return "Hello " + someOne;
    }
}
