package cn.itcast.day09.demo02Reflection;

/**
 * @author: xie
 * @create: 2019-10-14 20:35
 **/
public class Person {
    private String name;

    public String mouth;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("eat...");
    }

    public void eat(String food){
        System.out.println("eat..."+food);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
