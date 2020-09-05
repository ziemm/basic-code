package cn.xie.pack;

import java.util.Scanner;

/**
 * 混合背包问题，判断每种物品的要求，分成01背包，完全背包，和多重背包问题
 * 有 N 种物品和一个容量是 V 的背包。
 *
 * 物品一共有三类：
 *
 * 第一类物品只能用1次（01背包）；
 * 第二类物品可以用无限次（完全背包）；
 * 第三类物品最多只能用 si 次（多重背包）；
 * 每种体积是 vi，价值是 wi。
 *
 * 求解将哪些物品装入背包，可使物品体积总和不超过背包容量，且价值总和最大。
 * 输出最大价值。
 *
 * 输入格式
 * 第一行两个整数，N，V，用空格隔开，分别表示物品种数和背包容积。
 *
 * 接下来有 N 行，每行三个整数 vi,wi,si，用空格隔开，分别表示第 i 种物品的体积、价值和数量。
 *
 * si=−1 表示第 i 种物品只能用1次；
 * si=0 表示第 i 种物品可以用无限次；
 * si>0 表示第 i 种物品可以使用 si 次；
 * 输出格式
 * 输出一个整数，表示最大价值。
 * @author: xie
 * @create: 2020-08-25 17:02
 **/
public class MixPack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //物品个数
        int c = sc.nextInt(); //背包容量

        int[] v = new int[n+1];//每种物品体积
        int[] w = new int[n+1];//每种物品
        int[] s = new int[n+1];//每种物品个数，注意-1，0 代表的特殊含义

        for (int i = 1; i <=n ; i++) {
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
            s[i] = sc.nextInt();
        }

        int[] dp = new int[c+1]; //

        for (int i = 1; i <= n; i++) {
            //根据s[i]来判断物品使用哪种背包
            if(s[i]==-1){
                /*该种物品使用01背包*/
                for (int j = c; j >=v[i]; j--) {
                    dp[j] = Math.max(dp[j],dp[j-v[i]]+w[i]);
                }
            }else if(s[i]==0){
                /*该种物品使用完全背包*/
                for (int j = v[i]; j <=c; j++) {
                    dp[j] = Math.max(dp[j],dp[j-v[i]]+w[i]);
                }
            }else if(s[i]>=1){
                /*该种物品使用多重背包*/
                if(c<=s[i]*v[i]){
                    //此时转化为完全背包
                    for (int j = v[i]; j <=c; j++) {
                       dp[j] = Math.max(dp[j],dp[j-v[i]]+w[i]);
                    }
                }else {
                    //此时转化为二进制优化的01背包问题
                    int  k =1;
                    while (k<s[i]){
                        for (int j = c; j >=k*v[i]; j--) {
                            dp[j] = Math.max(dp[j],dp[j-k*v[i]]+k*w[i]);
                            s[i] -= k;
                            k *= 2;
                        }
                    }
                    for (int j = c; j >=s[i]*v[i]; j--) {
                        dp[j] = Math.max(dp[j],dp[j-s[i]*v[i]]+s[i]*w[i]);
                    }
                }
            }
        }
        System.out.println(dp[c]);
    }
}
