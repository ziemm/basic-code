package cn.xie.www.homework2;

import java.util.Scanner;

/**
 * 积木城堡
 * https://blog.csdn.net/wx2306/article/details/79489448
 * @author: xie
 * @create: 2019-11-12 22:08
 **/
public class T3 {
    private static int maxHeight=10001;
    private static int[][] dp;
    private static int[][] a;
    private static int[] c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=0; //记录城堡中最大高度
        int n =sc.nextInt();//城堡个数
        a=new int[n][101];
        c=new int[n];//记录每个城堡中积木个数
        for (int i = 0; i < n; i++) {
            int sum =0;
            int c1 = sc.nextInt();
            while(c1>0){//逐层输入城堡的数据
              a[i][c[i]]=c1;
              c[i]++;
              sum+=c1;//累加城堡的高度
              c1=sc.nextInt();
            }
            if(sum>m){//记录所有城堡中最大的高度
                m=sum;
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("  "+a[i][j]);
            }
            System.out.println();
        }
    }



}
