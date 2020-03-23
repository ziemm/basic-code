package cn.xie.base01.demo01;

import java.util.Scanner;

public class Demo01 {


    public static void main(String[] args) {
        System.out.println("输出一段代码");
        System.out.println("笔记本电脑已经写出了Java文件，明天去实验室去测试在实验室是否能pull运行！");
        System.out.println("请输入数字：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("输入的数字"+num);
    }
}
