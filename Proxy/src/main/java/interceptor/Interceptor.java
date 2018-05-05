package interceptor;

public interface Interceptor {
    public boolean before();
    public void around();
    public void after();
}
