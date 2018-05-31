package com.damon.myRPC.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProviderReflect {
    private static final ExecutorService executorService = Executors.newCachedThreadPool();

    public static void provider(final Object service, int port) throws Exception{
        ServerSocket serverSocket = new ServerSocket(port);
        while(true){
            final Socket socket = serverSocket.accept();
            executorService.execute(new Runnable() {
                public void run() {
                    try {
                        ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                        String methodName = objectInputStream.readUTF();
                        Object[] args = (Object[]) objectInputStream.readObject();
                        Object result = methodReflect(service, methodName);
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                        objectOutputStream.writeObject(result);
                        objectInputStream.close();
                        objectOutputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public static Object methodReflect(Object object, String methodName){
        try {
            Method method = object.getClass().getMethod(methodName);
            Object result = method.invoke(object);
            return result;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
