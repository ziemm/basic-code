package cn.xie.domain;

/**
 * @author: xie
 * @create: 2019-10-21 19:26
 **/
public class Person {
    int pid;
    String name;

    public Person() {
    }

    public Person(int pid, String name) {
        this.pid = pid;
        this.name = name;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                '}';
    }
}
