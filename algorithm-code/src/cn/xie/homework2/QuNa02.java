package cn.xie.homework2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: xie
 * @create: 2020-09-23 20:14
 **/
public class QuNa02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.nextLine();
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String[] s1 = str1.trim().split(" ");
        String[] s2 = str2.trim().split(" ");

        int i = longest(s1, s2);
        System.out.println(i);

    }
    public static int longest(String[] s1, String[] s2){
        int[][] num=new int[s1.length+1][s2.length+1];
        for(int i=1;i<s1.length+1;i++){
            for(int j=1;j<s2.length+1;j++){
                if(s1[i-1].equals(s2[j-1])){
                    num[i][j]=1+num[i-1][j-1];
                }
                else{
                    num[i][j]=Math.max(num[i-1][j],num[i][j-1]);
                }
            }
        }
        int s1position=s1.length,s2position=s2.length;
        List<String> result=new LinkedList<String>();
        while(s1position>0 && s2position>0){
            if(s1[s1position-1].equals(s2[s2position-1])){
                result.add(s1[s1position-1]);
                s1position--;
                s2position--;
            }
            else if(num[s1position][s2position-1]>=num[s1position-1][s2position]){
                s2position--;
            }
            else{
                s1position--;
            }
        }
        return result.size();
    }
}
