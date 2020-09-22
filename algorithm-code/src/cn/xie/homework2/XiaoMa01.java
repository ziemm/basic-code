package cn.xie.homework2;

import java.util.Scanner;

/**
 * @author: xie
 * @create: 2020-09-20 15:46
 **/
public class XiaoMa01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().trim();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int index = i;
            index += 2;
            if(s.charAt(i)!=s.charAt(index-1))
                continue;
            while (index <=s.length()){
                if(judge(s.substring(i,index))){
                    ans++;
                }
                index +=2;
            }
        }
        System.out.println(ans);
    }

    public static boolean judge(String s){
        int n = s.length();
        return s.substring(0,n/2).equals(s.substring(n/2));
    }
}
