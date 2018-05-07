package interceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*AOP主要有2部分：
* 1.新建Proxy实例返回给需要代理的对象，由接口接收（如例中的bind()），
* 该对象在调用方法时会转向调用invoke
* 2.invoke方法*/
public class JDKProxy implements InvocationHandler {
    private Object obj;
    private String interceptorClass;

    public JDKProxy(Object obj, String interceptorClass){
        this.obj = obj;
        this.interceptorClass = interceptorClass;
    }

    public static Object bind(Object obj, String interceptorClass){
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(), new JDKProxy(obj, interceptorClass));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (interceptorClass == null){
            return method.invoke(obj, args);
        }
        Object result = null;
        Interceptor interceptor = (Interceptor)Class.forName(interceptorClass).newInstance();
        if(interceptor.before()){
            result = method.invoke(obj, args);
        }else {
            interceptor.around();
        }
        interceptor.after();
        return result;
    }
}
