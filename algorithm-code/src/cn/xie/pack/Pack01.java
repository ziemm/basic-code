package cn.xie.pack;

import javax.swing.plaf.metal.MetalIconFactory;
import java.util.Scanner;

/**
 * @author: xie
 * @create: 2020-08-23 11:13
 **/
public class Pack01 {

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
        int[][] dp = new int[n+1][v+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= v; j++) {
                if(j>=vi[i]){ //如果当前背包体积>=当前物品体积，装得下时
                    //选择放或不放的最大值
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-vi[i]]+wi[i]);
                }else {//装不下时
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[n][v]);
    }

}
