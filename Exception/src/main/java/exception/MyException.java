package exception;

import java.io.IOException;

public class MyException extends Exception {
    public MyException(){}

    public MyException(String msg){
        super(msg);
    }
}
