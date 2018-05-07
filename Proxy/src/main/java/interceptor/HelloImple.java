package interceptor;

public class HelloImple implements Hello {
    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

    public void selfMethod(){
        System.out.println("Not Implements Method");
    }
}
