package cn.itcast.day07.demo04;

/**
 * @author: xie
 * @create: 2019-09-11 22:46
 **/
public class Test {


    public static void main(String[] args) {
        Person p = new Person();
        Person.Heart heart = p.new Heart();
        heart.jump();
    }
}
