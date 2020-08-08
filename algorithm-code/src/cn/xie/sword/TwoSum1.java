package cn.xie.sword;

/**
 * @author: xie
 * @create: 2020-08-08 19:57
 **/
public class TwoSum1 {
    public double[] twoSum(int n) {
        int dp[][] = new int[n+1][6*n+1];
        for(int i =1;i<=6;i++){
            dp[1][i]=1;
        }
        for(int i=2;i<=n;i++){//表示骰子的个数
            for(int s = i;s<=6*i;s++){
                for(int j=1;j<=6;j++){
                    if(s<j+(i-1)){//当总数还没有j大时，不存在
                        break;
                    }
                    dp[i][s] += dp[i-1][s-j];//当前n个筛子出现的点数之和等于前一次出现的点数之和加上这一次出现的点数
                }
            }
        }
        double total = Math.pow((double)6,(double)n);
        double[] ans = new double[5*n+1];
        for(int i = n;i<=6*n;i++){
            ans[i-n] = ((double)dp[n][i])/total;
        }
        return ans;
    }
}
