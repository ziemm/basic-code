package cn.itcast.day07.demo01;

import java.util.Random;

/*
* 随机数生成复习
* */
public class DemoRandom {
    public static void main(String[] args) {
        //带参的重载，参数是范围
        Random r = new Random();
        for (int i = 0; i < 50; i++) {
            System.out.println(r.nextInt(10));
        }
        System.out.println("Math.random："+Math.random());

    }
}
