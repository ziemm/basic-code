package cn.xie.demo03_decorate.demo;

/**
 * @author: xie
 * @create: 2020-04-16 15:16
 **/
public class Person {
    public Person(){};

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("装饰的人："+name);
    }
}
