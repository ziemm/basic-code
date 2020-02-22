package cn.xie.homework2;

import java.util.Scanner;

/**
 * 顺治帝滑雪（DP下降）
 *
 * @author: xie
 * @create: 2019-11-12 19:52
 **/
public class T2 {
    private static int r;
    private static int c;
    private static int[][] m;
    private static int[][] dp;
    private static int[][] dir =new int[][]{{-1,0},{1,0},{0,-1},{0,1}};//标定方向
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();
        m = new int[r][c];
        dp = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j]=sc.nextInt();
            }
        }
        //初始化dp,也就是子问题的最佳值，本题是length
        int max =0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int temp = longestPath(i,j);
                if(temp>max){
                    max=temp;
                }
            }
        }
        System.out.println(max);
    }
    public static int longestPath(int row,int col){
        if(dp[row][col]!=0){
            return dp[row][col];
        }
        int a=0,b=0,max=0;
        for(int i=0;i<4;i++){
            //左右上下滑
            a=row+dir[i][0];
            b=col+dir[i][1];
            if(a>=0&&a<r&&b>=0&&b<c&&m[a][b]<m[row][col]){
                int temp = longestPath(a,b);
                if(temp>max){
                    max=temp;
                }
            }
        }
        dp[row][col]=max+1;
        return max+1;
    }


}
