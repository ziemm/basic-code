package cn.itcast.day07.demo02;

/**
 * 定义一个数组，用来存储对象
 *
 * @author: xie
 * @create: 2019-09-05 17:40
 **/
public class DemoArray {
    public static void main(String[] args) {
        Person[] array = new Person[3];
        Person one = new Person("张三",18,true);
        Person two = new Person("张四",18,true);
        Person three = new Person("张五",20,false);
        array[0] = one;
        array[1] = two;
        array[2] = three;
        System.out.println( array[0]);
        System.out.println( array[1]);
        System.out.println( array[2]);

    }
}
