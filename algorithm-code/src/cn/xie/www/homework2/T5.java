package cn.xie.www.homework2;

import java.util.Scanner;

/**
 * @author: xie
 * @create: 2019-11-17 12:53
 **/
public class T5 {
    private static long n,k;
    private static long[] c =new long[12];
    private static long[][] M = new long[12][12];
    private static int MOD =7777777;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k=sc.nextLong();
        n=sc.nextLong();
        System.out.println(k);
        long[][] m = new long[12][12];
        for (int i = 0; i < k - 1; i++) {
            m[i][i+1]=1;
        }
        for (int i = 0; i < k; i++) {
            m[(int) (k-1)][i]=1;
        }
        long tt =1;
        c[0]=1;
        for (int i = 1; i < k; i++) {
            c[i]=tt;
            tt+=c[i];
        }
        long[][] rr =dg(M,n);
        long res =0;
        for (int i = 0; i < k; i++) {
            res+=rr[0][i]*c[i];
        }
        System.out.println(res%MOD);
    }


    public static long[][] mul(long[][] a,long[][] b){
        long[][] res = new long[12][12];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                long temp = 0;
                for (int l = 0; l < k; l++) {
                    temp+=a[i][l]*b[l][j];
                }
                temp=temp%MOD;
                res[i][j]=temp;
            }
        }
        return  res;
    }

    public static long[][] dg(long[][] t,long num){
        long[][] res = new long[12][12];
        if(num==1){
            res=t;
        }else  if(num==2){
            res = mul(t,t);
        }else  if(num%2!=0){
            long[][] temp1 =dg(t,num/2);
            long[][] temp2 = mul(temp1,M);
            res = mul(temp1,temp2);
        }else {
            long[][] temp =dg(t,num/2);
            res=mul(temp,temp);
        }
        return res;
    }


}

