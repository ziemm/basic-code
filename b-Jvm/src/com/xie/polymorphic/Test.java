package com.xie.polymorphic;

/**
 * @author: xie
 * @create: 2020-03-19 15:56
 **/
public class Test {
    public static void main(String[] args) {
       int a = 0;
       int[] b={0,0};
       String s = "b";
       get(a,s,b);
       System.out.println(a+" "+ s+" "+b[0]);//0 b 1

    }
    public static void  get(int a,String s,int[] b){
       a=1;
       s="a";
       b[0]=1;
    }
}
