package com.xie.classloading;

/**
 * 被动使用类字段演示三：
 * 常量在编译阶段会存入调用类的常量池中，本质没有直接引用到定义常量的类，本质不会初始化该类
 * 常量在
 * @author: xie
 * @create: 2020-03-14 22:49
 **/
public class ConstClass {
    static {
        System.out.println("ConstClass init!");
    }
    public static final String HELLOWORLD ="hello world";
}
