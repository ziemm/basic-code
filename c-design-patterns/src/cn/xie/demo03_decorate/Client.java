package cn.xie.demo03_decorate;

/**
 * @author: xie
 * @create: 2020-04-16 14:59
 **/
public class Client {
    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();//具体被装饰的对象

        ConcreteDecotetorA d1 = new ConcreteDecotetorA();
        ConcreteDecotetorB d2 = new ConcreteDecotetorB();

        d1.setComponent(c);
        d1.Operation();
        d2.setComponent(d1);
        d2.Operation();
    }
}
