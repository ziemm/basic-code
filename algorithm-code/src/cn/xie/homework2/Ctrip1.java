package cn.xie.homework2;

import java.util.Scanner;

/**
 * @author: xie
 * @create: 2020-11-17 19:14
 **/
public class Ctrip1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            Integer num  = str.charAt(i)-65;
            sb.append(num);
        }
        String s = sb.toString();
        System.out.println(s);
        int res = translate(s);
        if(s==null){
            System.out.println(0);
        }else {
            System.out.println(res - 1);
        }
    }
    public static int translate(String s){
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
