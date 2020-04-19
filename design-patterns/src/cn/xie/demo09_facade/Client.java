package cn.xie.demo09_facade;

/**
 * @author: xie
 * @create: 2020-04-19 23:02
 **/
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.methodA();
        facade.methodB();
    }
}
