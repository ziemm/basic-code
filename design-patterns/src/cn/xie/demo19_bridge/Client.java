package cn.xie.demo19_bridge;

/**
 * @author: xie
 * @create: 2020-04-23 10:48
 **/
public class Client {
    public static void main(String[] args) {
        Abstraction ab = new RefinedAbstraction();

        ab.setImplementor(new ConcreteImplementA());
        ab.operation();

        ab.setImplementor(new ConcreteImplementB());
        ab.operation();
    }
}
