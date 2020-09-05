package cn.xie.pack;

import java.util.Scanner;

/**
 * @author: xie
 * @create: 2020-08-24 22:07
 **/
public class MultiplePack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //物品个数
        int c = sc.nextInt(); //背包容量
        int[] v = new int[n+1];
        int[] w = new int[n+1];
        int[] s = new int[n+1];

        for (int i = 1; i <=n ; i++) {
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
            s[i] = sc.nextInt();
        }

        int[] dp = new int[c+1];
        for (int i = 1; i <= n; i++) {
            if(v[i]*s[i]>=c){ //如果当前物品的 体积v*个数s >= 背包容量c 则转化为完全背包问题
                for (int j = v[i]; j <=c ; j++) {
                    dp[j] = Math.max(dp[j],dp[j-v[i]]+w[i]);
                }
            }else {//拆成多个01背包的子问题
                int k = 1;
                while (k<s[i]){
                    /*01背包解法*/
                    for (int j = c; j >=k*v[i] ; j--) {
                        dp[j] = Math.max(dp[j],dp[j-k*v[i]]+k*w[i]);
                    }
                    s[i]-=k;
                    k *=2;
                }
                for (int j = c; j >=s[i]*v[i] ; j--) {
                    dp[j] = Math.max(dp[j],dp[j-s[i]*v[i]]+s[i]*w[i]);
                }
            }
        }
        System.out.println(dp[c]);
    }
}
