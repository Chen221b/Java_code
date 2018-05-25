package exception;

public class Main {
    public static void main(String[] args){
        UseException useException = new UseException();
        try {
            useException.throwException();
        } catch (MyException e) {
            System.out.println(e);
        }
        System.out.println("After Exception ... Continue");
    }
}
