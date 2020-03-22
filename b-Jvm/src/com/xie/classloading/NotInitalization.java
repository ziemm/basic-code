package com.xie.classloading;

/**
 * @author: xie
 * @create: 2020-03-14 13:43
 **/
public class NotInitalization {
    public static void main(String[] args) {
        // System.out.println(SubClass.value);//未出现SubClass类的的静态块初始化语句，说明子类未被主动初始化

        // SuperClass[] sca = new SuperClass[10];//该句无任何输出，说明通过数组来引用类。不会触发此类的初始化

        System.out.println(ConstClass.HELLOWORLD);//没有出现ConstClass init！字样，说明该类未初始化

    }
}
