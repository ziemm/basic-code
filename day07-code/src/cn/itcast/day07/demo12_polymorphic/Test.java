package cn.itcast.day07.demo12_polymorphic;

/**
 * @author: xie
 * @create: 2020-03-18 23:34
 **/
public class Test {
    public static void main(String[] args) {
        Human human1 = new Man();
        Human human2 = new Woman();
        human1.sayHello();
        human2.sayHello();
    }
}
