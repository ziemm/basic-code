package cn.itcast.day07.demo01;

import java.util.Scanner;

public class DemoMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //匿名对象作为方法的参数
        input(sc);
        input(new Scanner(System.in));
    /* System.out.println("please input the first number:");
        int a = sc.nextInt();
        System.out.println("please input the second number:");
        int b = sc.nextInt();
        System.out.println("please input the third number:");
        int c = sc.nextInt();

        //&#x83b7;&#x53d6;&#x4e09;&#x4e2a;&#x6570;&#x4e2d;&#x7684;&#x6700;&#x5927;&#x503c;
        int temp =(a>b?a:b);
        int max = (temp>c?temp:c);
        System.out.println("The max number is "+max);*/
    }

    public static void input(Scanner sc){
        System.out.println(sc);
    }

}
