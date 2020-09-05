package cn.xie;

/**
 * @author: xie
 * @create: 2020-08-21 14:34
 **/
public class BossBonus {
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n+1];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = 1;
        }
        for (int i=1;i<=n;i++){
            for (int j =1; j <i ; j++) {
                dp[i] = dp[i]+dp[j];
            }
        }

        System.out.println(dp[n]);
    }
}
