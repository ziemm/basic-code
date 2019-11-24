package cn.xie.www.homework2;

import java.util.Scanner;

import static java.lang.Math.max;

/**
 * 最勇敢的机器人
 * @author: xie
 * @create: 2019-11-18 19:46
 **/
public class T7 {
    private static int n,wmax,k,a,b;
    private static int[] p = new int [1001];
    private static int[] w = new int [1001];
    private static int[] f = new int [1001];
    private static int[] ans = new int [1001];
    private static int[][] t = new int[1001][1001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        wmax=sc.nextInt();
        k=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            p[i]=sc.nextInt();
            w[i]=sc.nextInt();
            f[i]=i; //每个物品默认指向自己
        }
        for (int i = 0; i < k; i++) {
            a=sc.nextInt();
            b=sc.nextInt();
            union(a,b);
        }
        for(int i =1;i<=n;i++){//把n个东西分成不同的类；
            int fi =find(i);
            t[fi][++t[fi][0]]=i;
        }
        for (int i = 1; i <=n ; i++) {
            if(t[i][0]==0){
                continue;
            }
            for(int j=wmax;j>=0;j--){//01背包选择,这里j一定是大于等于0；
                for (int k = 1; k <=t[i][0]; k++) {
                    int num =t[i][k];
                    if(j>=w[num]){
                        ans[j]=max(ans[j], ans[j-w[num]]+p[num]);
                    }
                }
            }
        }
        System.out.println(ans[wmax]);
    }


    //实现并查集
    public static int find(int x){//查
        int r=x;
        while(f[r]!=r) r=f[r];
        int i=x,j;
        while(i!=r)
        {
            j=f[i];
            f[i]=r;
            i=j;
        }
        return r;
    }
    public static void union(int x ,int y){//并
        int fx=find(x);
        int fy=find(y);
        if(fx!=fy)
            f[fx]=fy;
    }

}
