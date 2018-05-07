package interceptor;

import proxy.HelloImpl;

/*责任链模式配合多拦截器使用例子*/
public class Main {
    public static void main(String[] args){
        Hello hello = (Hello)JDKProxy.bind(new HelloImple(), "interceptor.MyInterceptor");
        Hello hello2 = (Hello)JDKProxy.bind(hello, "interceptor.Interceptor2");
        hello2.sayHello();
    }
}
