package cn.itcast.day07.demo02;

/**
 * @author: xie
 * @create: 2019-09-05 17:43
 **/
public class Person {
    String name ;
    int age;
    boolean sexy;

    public Person() {
    }

    public Person(String name, int age, boolean sexy) {
        this.name = name;
        this.age = age;
        this.sexy = sexy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSexy() {
        return sexy;
    }

    public void setSexy(boolean sexy) {
        this.sexy = sexy;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sexy=" + sexy +
                '}';
    }
}
