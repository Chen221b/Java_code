package interceptor;

public class MyInterceptor implements Interceptor {
    @Override
    public boolean before() {
        System.out.println("MyInterceptor#before");
        return true;
    }

    @Override
    public void around() {

    }

    @Override
    public void after() {
        System.out.println("MyInterceptor#after");
    }
}
