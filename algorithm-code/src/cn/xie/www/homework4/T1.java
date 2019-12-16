package cn.xie.www.homework4;

import java.util.Scanner;

/**
 * @author: xie
 * @create: 2019-12-16 08:12
 **/
public class T1 {

    static long num ;
    static int count =0;

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        num=sc.nextLong();
        int res = mul(1);
       System.out.println(res);
    }

    public static int mul(long n){
        if(n>=num)
            return count;
        if(n%2==1){
            n=n*2;
            count++;
            mul(n);
        }else{
          n=n+7;
          count++;
          mul(n);
        }
        return count;
    }
}
