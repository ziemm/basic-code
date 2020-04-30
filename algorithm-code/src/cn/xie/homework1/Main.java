package cn.xie.homework1;

import java.util.Scanner;

/**
 * @author: xie
 * @create: 2020-04-23 19:07
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n =scan.nextInt(); //行数

        int[][] arr = new int[n+1][n+1];


        //输入
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j <=i; j++) {
                arr[i][j]=scan.nextInt();
            }
        }

        //更新树的结点
        for (int i = n-1; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                arr[i][j]+=Math.max(arr[i+1][j],arr[i+1][j+1]);
            }
        }

        System.out.println(arr[1][1]);

    }
}
