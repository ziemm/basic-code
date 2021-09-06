package cn.xie.nowcoder;

/**
 * @author: xie
 * @create: 2021-07-11 23:28
 **/
public class IsMatch {
    public boolean match (String str, String pattern) {
        int m = str.length();
        int n = pattern.length();
        boolean[][] dp = new boolean[m+1][n+1];

        dp[0][0] =true;
        //特别判断有一方为空的情况
        for(int i = 1;i<=n;i++){
            if(i>=2 && pattern.charAt(i-1)=='*')
                dp[0][i]=dp[0][i-2];
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (pattern.charAt(j - 1) == '.' || str.charAt(i - 1) == pattern.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];    //str和pattern最后一位匹配
                }
                else if (j >= 2 && pattern.charAt(j - 1) == '*'){
                    //考虑 x* 子结构，如果 x 能够匹配，则有0次，1次和多次的情况
                    if (pattern.charAt(j - 2) == '.' || pattern.charAt(j - 2) == str.charAt(i - 1))
                        dp[i][j] = dp[i][j - 2] || dp[i - 1][j - 2] || dp[i - 1][j];
                        //如果 x 不匹配，则只能算成0次
                    else
                        dp[i][j] = dp[i][j - 2];
                }
            }
        }

        return dp[m][n];
    }
}
