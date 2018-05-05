package proxy;

public class HelloImpl implements Hello, SecondInterface {
    public void say(String name){
        System.out.println("Hello " + name);
    }

    public void secondMethod(){
        System.out.println("SecondMethod");
    }

    public void secondImpl(){
        System.out.println("SecondImpl");
    }

    public void notImplMethod(){
        System.out.println("notImplMethod");
    }
}
