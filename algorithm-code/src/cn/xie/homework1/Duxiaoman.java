package cn.xie.homework1;

import java.util.Scanner;

/**
 * @author: xie
 * @create: 2020-09-20 21:04
 **/
public class Duxiaoman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String xiaoming = sc.nextLine().trim();
        String panel = sc.nextLine().trim();
        int[] c1 = new int[128];
        int[] c2 = new int[128];
        for (int i = 0; i < xiaoming.length(); i++) {
            c1[xiaoming.charAt(i)]++;
        }
        for (int i = 0; i < panel.length(); i++) {
            c2[panel.charAt(i)]++;
        }
        int res =0;
        for (int i = 0; i < c2.length; i++) {
            if(c2[i]==0){
                continue;
            }
            res += Math.min(c1[i],c2[i]);
        }
        System.out.println(res);
    }
}
