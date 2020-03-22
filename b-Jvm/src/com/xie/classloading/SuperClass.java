package com.xie.classloading;

/**
 * 被动使用类字段演示一：
 * 通过子类引用父类法人静态字段，不会导致子类初始化
 * @author: xie
 * @create: 2020-03-14 13:39
 **/
public class SuperClass {
    static{
        System.out.println("SuperClass init!");
    }
    public static int value =123;
}
