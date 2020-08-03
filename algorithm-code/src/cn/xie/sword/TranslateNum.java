package cn.xie.sword;

/**
 * 使用动态规划的思想，
 *
 * @author: xie
 * @create: 2020-07-23 16:10
 **/
public class TranslateNum {
    public int translateNum(int num) {
        String s = String.valueOf(num);

        int[] dp = new int[s.length()+1];
        dp[0]=dp[1]=1;
        for (int i = 2; i <= s.length(); i++) {
           String sTemp = s.substring(i-2,i); //每次观察两位
            if(sTemp.compareTo("10")>=0 && sTemp.compareTo("25")<=0){
                //说明2位数可分开翻译
                dp[i]=dp[i-1]+dp[i-2];
            }else {
                dp[i]=dp[i-1];
            }
        }
        return dp[dp.length-1];
    }
}
