package reflect;

import static reflect.MethodReflect.reflect;

public class Main {
    public static void main(String[] args){
        Hello hello = new Hello();
        String result = (String) reflect(hello, "sayHello");
        System.out.println(result);
    }
}
