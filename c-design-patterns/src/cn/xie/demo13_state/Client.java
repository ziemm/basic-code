package cn.xie.demo13_state;

/**
 * @author: xie
 * @create: 2020-04-20 23:27
 **/
public class Client {
    public static void main(String[] args) {
        Context c = new Context(new ConcreteStateA());
        c.request();
        c.request();
        c.request();
        c.request();
    }
}
