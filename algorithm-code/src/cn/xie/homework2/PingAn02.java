package cn.xie.homework2;

import java.util.Scanner;

/**
 * 生小牛
 * @author: xie
 * @create: 2020-09-19 22:52
 **/
public class PingAn02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = count(n);
        System.out.println(res);

    }
    public static int count(int n){
        int[] dp = new int[n+1];
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        if(n==3)
            return 3;
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for (int i=4;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-3];
        }
        return dp[n];
    }
}
