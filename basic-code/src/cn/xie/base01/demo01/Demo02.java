package cn.xie.base01.demo01;

import java.util.Scanner;

public class Demo02 {
    //匿名对象作为参数，适合对象只使用一次
    public static void main(String[] args) {
//        methodParam(new Scanner(System.in));
    Scanner sc = methodReturn();
    int num = sc.nextInt();
    System.out.println("输入的是："+ num);
    }
    public static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的是"+num);
    }

    //匿名对象作为返回值
    public static Scanner methodReturn(){

        return new Scanner(System.in);
    }

}
