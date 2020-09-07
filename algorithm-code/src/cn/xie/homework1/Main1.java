package cn.xie.homework1;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: xie
 * @create: 2020-08-23 15:55
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String s1 = str.replaceAll(" ", "");
        char[] jsb = s1.toCharArray();
        System.out.println(jsb.length);
        for (int i = 0; i < jsb.length; i++) {
            System.out.println(jsb[i]);
        }


    }
}

