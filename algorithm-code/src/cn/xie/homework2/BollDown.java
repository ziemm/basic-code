package cn.xie.homework2;

import java.util.Scanner;

/**
 * @author: xie
 * @create: 2020-08-27 23:02
 **/
public class BollDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2*n-1];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String[] str = sc.nextLine().trim().split(" ");
            for (int j = 0; j < str.length; j++) {
                arr[i][j] = Integer.parseInt(str[i]);
            }
        }

        for (int i = n-2; i >=0 ; i--) {
            for (int j = 0; j <2*(i+1)-1 ; j++) {
                arr[i][j] += Math.max(arr[i+1][j],Math.max(arr[i+1][j+1],arr[i+1][j+2]));
            }
        }
        System.out.println(arr[0][0]);
    }

}
