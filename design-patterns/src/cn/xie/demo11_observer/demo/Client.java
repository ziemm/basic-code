package cn.xie.demo11_observer.demo;

/**
 * @author: xie
 * @create: 2020-04-20 10:39
 **/
public class Client {
    public static void main(String[] args) {
        Boss hugansan = new Boss();

        StockObserver tongshi1 = new StockObserver("魏",hugansan);
        hugansan.attach(tongshi1);
        hugansan.setSubjectState("老板回来了");
        hugansan.notifyObservers();
    }
}
