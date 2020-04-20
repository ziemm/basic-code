package cn.xie.demo11_observer.demo;

/**
 * @author: xie
 * @create: 2020-04-20 09:55
 **/
public abstract class Observer {

    protected  String name;
    protected  Subject sub;

    public Observer(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    public abstract void update();
}
