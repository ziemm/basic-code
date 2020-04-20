package cn.xie.demo11_observer.demo;

/**
 * @author: xie
 * @create: 2020-04-20 10:27
 **/
public class StockObserver extends Observer {

    public StockObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(name+"继续工作");
    }
}
