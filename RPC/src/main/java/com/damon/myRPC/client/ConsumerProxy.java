package com.damon.myRPC.client;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;

public class ConsumerProxy {
    public static <T> T consume(final Class<T> interfaceClass, final String host, final int port){
        return (T) Proxy.newProxyInstance(interfaceClass.getClassLoader(), new Class<?>[]{interfaceClass}, new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Socket socket = new Socket(host, port);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                objectOutputStream.writeUTF(method.getName());
                objectOutputStream.writeObject(args);
                ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                Object result = objectInputStream.readObject();
                objectOutputStream.close();
                objectInputStream.close();
                return result;
            }
        });
    }
}
