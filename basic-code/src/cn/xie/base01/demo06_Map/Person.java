package cn.xie.base01.demo06_Map;

import java.util.Objects;

/**
 * @author: xie
 * @create: 2019-09-13 14:00
 **/
public class Person {
    private String name;
    private int age;

    public Person(){};

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

 /*   @Override
    public boolean equals(Object o) {
       //增加一个判断，传递参数如果是this本身，直接返回True，
        if(o==this){
            return true;
        }
        //增加一个判断，传递的参数obj如果是null本身，直接返回false
        if(obj==null){
            return false;
        }
        //增加一个判断，放置类型装换异常
        if(obj instanceof Person){
            //向下转型
            Person p = (Person) o;
            boolean b = this.name.equals(p.name)&&this.age==p.age;
            return b;
        }
        //不是Paerson类型直接返回false;
        return  false;
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
