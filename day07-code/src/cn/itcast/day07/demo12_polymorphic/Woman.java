package cn.itcast.day07.demo12_polymorphic;

/**
 * @author: xie
 * @create: 2020-03-18 23:33
 **/
public class Woman extends Human {
    @Override
    public void sayHello() {
        System.out.println("hello Woman!");
    }
}
