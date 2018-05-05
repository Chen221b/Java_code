package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
    private Object target;

    DynamicProxy(Object target){
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        before();
        Object result = method.invoke(target, args);
        return  result;
    }

    private void before(){
        System.out.println("Before");
    }
}
