package cn.xie.homework2;

import java.util.Scanner;

/**
 * @author: xie
 * @create: 2019-11-11 16:39
 **/
public class T1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                arr[i][j]=scan.nextInt();
            }
        }

        //初始化状态
        int[][] dp = new int[n][n];
        dp[n - 1][0] = arr[n - 1][0];
        for (int j = 1; j < n; ++j) { //从左到右
            dp[n - 1][j] = arr[n - 1][j] + dp[n - 1][j - 1];
        }
        dp[n - 1][n - 1] = Math.min(dp[n - 1][n - 1], arr[n - 1][n - 1]) + dp[n - 1][0];
        for (int j = n - 1 - 1; j >= 0; --j) { //从右到左
            dp[n - 1][j] = Math.min(dp[n - 1][j], arr[n - 1][j] + dp[n - 1][j + 1]);
        }

        for (int i = n - 2; i >= 0; --i) {
            //DP下一层状态
            for (int j = 0; j <= i; ++j) {
                if (j == 0) {
                    dp[i][j] = arr[i][j] + Math.min(dp[i + 1][j],Math.min(dp[i + 1][j + 1], dp[i + 1][i + 1]));
                } else if (j == i) {
                    dp[i][j] = arr[i][j] + Math.min(dp[i + 1][j],Math.min(dp[i + 1][j + 1], dp[i + 1][0]));
                } else {
                    dp[i][j] = arr[i][j] + Math.min(dp[i + 1][j], dp[i + 1][j + 1]);
                }
            }
            //DP优化当层状态, 为下层状态做准备
            if (i != 0) {
                dp[i][0] = Math.min(dp[i][0], arr[i][0] + dp[i][i]);
                for (int j = 1; j <= i; ++j) {
                    dp[i][j] = Math.min(dp[i][j], arr[i][j] + dp[i][j - 1]);
                }
                dp[i][i] = Math.min(dp[i][i], arr[i][i] + dp[i][0]);
                for (int j = i - 1; j >= 0; --j) {
                    dp[i][j] = Math.min(dp[i][j], arr[i][j] + dp[i][j + 1]);
                }
            }
        }
        System.out.println(dp[0][0]);
    }

}
