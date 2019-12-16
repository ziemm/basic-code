package cn.xie.www.homework3;

import java.util.Scanner;

/**
 * 24点游戏：深度搜索
 * @author: xie
 * @create: 2019-12-13 09:20
 **/
public class T4 {
    private static boolean[] book = new boolean[5];
    private static double[] w = new double[5];
    private static int ans =0;
    private static int flag = 0;

    public static void dfs(double sum,int n){
        if(flag==1) return;
        if(n==4&&(sum-24)*(sum-24)<=1e-5){//控制精度
            ans =1;
            flag=1;
        }
        for (int i = 1; i <=4 ; i++) {
            if(book[i]==false){//没有被标记过
                book[i]=true;
                //深度搜索，一共有四种运算法则
                dfs(sum+w[i],n+1);
                dfs(sum-w[i],n+1);
                dfs(sum*w[i],n+1);
                dfs(w[i]-sum,n+1);
                if(w[i]!=0)dfs(sum/w[i],n+1);
                if(sum!=0)dfs(w[i]/sum,n+1);
                book[i]=false;
            }
        }
    }

    public static void main(String[] args) {
        //获得输入值
        Scanner sc = new Scanner(System.in);
        String temp;
        for (int i = 1; i <=4 ; i++) {
            temp=sc.next();
            switch (temp){
                case "A":w[i]=1;break;
                case "J":w[i]=11;break;
                case "Q":w[i]=12;break;
                case "K":w[i]=13;break;
                default:w[i]=Double.parseDouble(temp);//此处可能会造成转换异常
            }
        }

        for (int i = 1; i <=4 ; i++) {
            book[i]=true;
            dfs(w[i],1);
            book[i]=false;
        }
        System.out.println(ans);
    }
}
