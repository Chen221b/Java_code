package proxy;

public class HelloProxy implements Hello {
    private Hello hello;

    public HelloProxy(Hello hello){
        this.hello = hello;
    }

    @Override
    public void say(String name) {
        before();
        this.hello.say(name);
    }

    @Override
    public void secondMethod() {

    }

    private void before(){
        System.out.println("Before");
    }
}
