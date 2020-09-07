package cn.xie.homework1;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: xie
 * @create: 2020-08-13 20:14
 **/
public class Solution {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int a = sc.nextInt();
       String str = sc.nextLine();
       String s = maxSub(str);
       System.out.println(a-s.length()/2);
    }

    private static String maxSub(String s) {
        int len =s.length();
        String result = "";
        int maxLen =0;
        if(len<=1)
            return "";
        String[] strs = new String[len];
        for (int i = 0; i < len; i++) {
            strs[i] =s.substring(i,len);
        }
        Arrays.sort(strs);
        for (int i = 0; i < len - 1; i++) {
            int tmp = lenTwoStr(strs[i],strs[i+1]);
            if(tmp > maxLen){
                maxLen = tmp;
                result = strs[i].substring(0,maxLen);
            }
        }
        return result;
    }

    public static int lenTwoStr(String str1, String str2) {
        if(str1.length()==0 || str2.length()==0)
            return 0;
        int i =0;
        while (i< str1.length() && i< str2.length() && str1.charAt(i)==str2.charAt(i)){
            i++;
        }
        return i;
    }
}