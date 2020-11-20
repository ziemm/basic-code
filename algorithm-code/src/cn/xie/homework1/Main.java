package cn.xie.homework1;

import java.util.*;

/**
 * @author: xie
 * @create: 2020-08-23 15:55
 **/
public class Main {
    public int translateNum(int num) {
        String s = String.valueOf(num);

        int[] dp = new int[s.length()+1];
        dp[0] = dp[1] =1;
        for (int i = 2; i <=s.length() ; i++) {
            String sTemp =s.substring(i-2,i);//观察两位
            if(sTemp.compareTo("10")>=0&&sTemp.compareTo("25")<=0){
                dp[i] = dp[i-1]+dp[i-2];
            }else {
                dp[i]=dp[i-1];
            }
        }
        return dp[dp.length-1];
    }
}
