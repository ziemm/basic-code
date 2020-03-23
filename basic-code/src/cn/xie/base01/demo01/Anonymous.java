package cn.xie.base01.demo01;

import java.util.Scanner;

public class Anonymous {
    public static void main(String[] args) {
        //使用匿名内部类
        System.out.println("请输入数字：");

        int num = new Scanner(System.in).nextInt();
        System.out.println("利用匿名内部类作为输入方式，输出向数字为："+num);
    }
}
