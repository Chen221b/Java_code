package observer;

/*观察者模式
* 1.被观察类（本例中的java.util.Observable），维护一个观察者的容器，有更新需要通知时调用观察者的update方法
* 2.观察者类，实现java.util.Observer#update*/
public class Main {
    public static void main(String[] args){
        JDObserver jdObserver = new JDObserver();
        ProductList productList = ProductList.getInstance();
        productList.addObserver(jdObserver);
        productList.addProduct("Intel 7700K");
    }
}
