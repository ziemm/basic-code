package cn.xie.pack;

import java.util.Scanner;

/**
 * 空间优化后的代码，
 * dp[v+1]的长度
 for (int i = 1; i <= n; i++)
 for (int j = v; j >=vi[i]; j--)
 dp[j] = Math.max(dp[j],dp[j-vi[i]]+wi[i]);
 * @author: xie
 * @create: 2020-08-23 14:10
 **/
public class Pack02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt(); //物品个数
        int v = sc.nextInt(); //物品容量
        int[] vi = new int[n+1];
        int[] wi = new int[n+1];
        for (int i = 1; i <=n ; i++) {
            vi[i] = sc.nextInt();
            wi[i] = sc.nextInt();
        }
        int[] dp = new int[v+1];
        for (int i = 1; i <= n; i++)
            for (int j = v; j >=vi[i]; j--)
                    dp[j] = Math.max(dp[j],dp[j-vi[i]]+wi[i]);
        System.out.println(dp[v]);
    }
}
