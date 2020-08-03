package cn.xie.sword;

/**
 * 基础dp
 * @author: xie
 * @create: 2020-07-23 16:57
 **/
public class MaxValue {
    public int maxValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m+1][n+1];
        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <=n ; j++) {
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1])+grid[i-1][j-1];
            }
        }
        return dp[m][n];
    }

    //优化后
    public int maxValue1(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] dp = new int[n+1];
        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <=n ; j++) {
                dp[j] = Math.max(dp[j-1],dp[j])+grid[i-1][j-1];
            }
        }
        return dp[n];
    }
}
