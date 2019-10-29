package cn.xie.www;


import java.util.Scanner;

public class M3 {
    private static int n =0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();
        System.out.println(countWays(n));
    }

    public static int countWays(int n) {
        int[] a =new int[1000001];
        a[1] = 1;
        a[2] = 2;
        a[3] = 4;
        for(int i=4;i<=n;i++)
            a[i] = (a[i-1]+(a[i-2]+a[i-3])%1000000007) % 1000000007;
        return a[n];
    }

}

