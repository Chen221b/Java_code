package observer;

import java.util.Observable;
import java.util.Observer;

public class JDObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        String newProduct = (String)arg;
        System.out.println("JD: " + newProduct);
    }
}
