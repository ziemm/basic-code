package cn.xie.base01.demo02;

/**
 * @author: xie
 * @create: 2020-08-22 14:26
 **/
public class DemoStatic {
    Person p1 = new Person();
    Person p2 = new Person();

    public static void main(String[] args) {
        Person.b = 2;
    }
}
