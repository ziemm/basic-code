package cn.xie.demo11_observer;

/**
 * @author: xie
 * @create: 2020-04-20 09:49
 **/
public class Client {
    public static void main(String[] args) {
        ConcreteSubject s = new ConcreteSubject();

        s.Attch(new ConcreteObserver("X",s));
        s.Attch(new ConcreteObserver("Y",s));
        s.Attch(new ConcreteObserver("Z",s));

        s.setSubjectState("ABC");
        s.notifyObservers();
    }
}
