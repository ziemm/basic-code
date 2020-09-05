package cn.xie.homework4;

/**
 * @author: xie
 * @create: 2020-09-01 09:44
 **/
public class Wuba3 {
    public int translateNum(int num){
        String s = String.valueOf(num);
        int[] dp = new int[s.length()+1];
        dp[0] = dp[1]= 1;

        for (int i = 2;i<=s.length();i++){
            String tmp =s.substring(i-2,i);
            if(tmp.compareTo("10")>=0 && tmp.compareTo("25")<=0){
                //字符串可以分开翻译
                dp[i] = dp[i-1]+dp[i-2];//翻译一位，翻译两位
            }else{
                dp[i] = dp[i-1];//不可以分开翻译
            }
        }
        return dp[dp.length-1];
    }
}
