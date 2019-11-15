package cn.xie.www.homework2;

/*
import java.util.Scanner;

*/
/**
 * 积木城堡2(有些许问题，部分wrong Answer)
 * @author:
 * @create: 2019-11-12 22:08
 **//*

public class T4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=0; //记录城堡中最大高度
        int n =sc.nextInt();//城堡个数
        int[][] a=new int[n][101];
        int[] c=new int[n];//记录每个城堡中积木个数
        int[][] dp =new int[n][10001];
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

        for (int i = 0; i < n; i++) {//计算每个城堡可能到达的最大高度
            for (int j = 0; j < c[i]; j++) {
                //记录dp未改变前状态
                int[] temp = new int[10001];
                System.arraycopy(dp[i], 0, temp, 0, temp.length);

                dp[i][a[i][j]]=1;
                for (int k = 1; k <=(m-a[i][j]); k++) {
                    if(temp[k]==1){
                        dp[i][k+a[i][j]]=1;//状态转移结束
                    }
                }
            }
        }
        //判断所有城堡可以到达的最大高度
        for (int i = m; i >=0 ; i--) {

            int j;
            for (j = 0; j < n; j++) {
                if(dp[j][i]!=1){
                    break;
                }
            }
            if(j==n){  //当j=2 时，说明经历的所有城堡，且此时的高度为最大高度
                System.out.println(i);
                break;
            }

        }

    }

}*/
