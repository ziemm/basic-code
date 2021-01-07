package cn.xie.homework2;

import java.util.Scanner;

/**
 * @author: xie
 * @create: 2020-10-18 19:46
 **/
public class YiDong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            int tmp = str.trim().split(" ").length;
            res[i] = tmp;
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
