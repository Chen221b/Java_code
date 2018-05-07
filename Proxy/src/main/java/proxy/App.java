package proxy;

import java.lang.reflect.Proxy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HelloImpl helloImpl = new HelloImpl();
        helloImpl.say("Damon");

        Hello hello1 = new HelloImpl();
        HelloProxy helloProxy = new HelloProxy(hello1);
        helloProxy.say("Static Proxy");

        /*使用JDK动态代理
        * 如果代理对象实现多个接口，则可以通过强制转换调用其他接口函数
        * 在Spring中还可以动态添加接口，亦称作引入*/
        Hello hello = new HelloImpl();
        DynamicProxy dynamicProxy = new DynamicProxy(hello);
        Hello helloJDKProxy = (Hello) Proxy.newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(), dynamicProxy);
        helloJDKProxy.say("Dynamic Proxy ");
        helloJDKProxy.secondMethod();
        SecondInterface secondInterface = (SecondInterface) helloJDKProxy;
        secondInterface.secondImpl();

        /*使用CGLib动态代理*/
        CGLibProxy cgLibProxy = new CGLibProxy();
        HelloImpl helloCGProxy = cgLibProxy.getProxy(HelloImpl.class);
        helloCGProxy.say("CGLib Proxy");
        helloCGProxy.notImplMethod();
        helloCGProxy.secondImpl();
    }
}
