package cn.itcast.day07.demo12_polymorphic;

/**
 * @author: xie
 * @create: 2020-03-18 23:31
 **/
public class Man extends Human{
    @Override
    public void sayHello() {
        System.out.println("hello Man");
    }
}
