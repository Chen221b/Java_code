package exception;

public class UseException {
    public void throwException() throws MyException{
        MyException myException = new MyException("This is MyEsception");
        throw myException;
    }
}
