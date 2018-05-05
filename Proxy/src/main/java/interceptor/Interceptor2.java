package interceptor;

public class Interceptor2 implements Interceptor {
    @Override
    public boolean before() {
        System.out.println("Interceptor2#before");
        return true;
    }

    @Override
    public void around() {

    }

    @Override
    public void after() {
        System.out.println("Interceptor2#after");
    }
}
