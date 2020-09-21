package cn.xie.homework2;

import java.util.Scanner;

/**
 * 定义三数最大运算
 * @author: xie
 * @create: 2020-09-19 22:53
 **/
public class PingAn01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double aa = max3(a+b,b,c);
        double bb = max3(a,b+c,c);
        double cc = max3(a,b,b+c);
        double m =0;
        try {
            m = aa/(bb+cc);
        }catch (Exception e){
            System.out.println("ERROR");
        }
        double ans = (double) Math.round(m*100)/100;
        System.out.printf("%.2f",ans);
    }

    public static  int max3(int a ,int b,int c){
        return Math.max(Math.max(a,b),c);

    }
}
