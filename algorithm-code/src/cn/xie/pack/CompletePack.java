package cn.xie.pack;

import java.util.Scanner;

/**
 * 完全背包，由01背包的空间优化形式代码的基础上调整
 * : 想象一下遍历每个物品时，在一轮循环中，从左到右的话，每多出该物品体积的空间，就会填充该物品。相当于完全背包问题
 * @author: xie
 * @create: 2020-08-23 14:34
 **/
public class CompletePack {
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
            for (int j = vi[i]; j <=v; j++)  //顺序
                dp[j] = Math.max(dp[j],dp[j-vi[i]]+wi[i]);
        System.out.println(dp[v]);
    }
}
