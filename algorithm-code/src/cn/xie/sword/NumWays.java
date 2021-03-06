package cn.xie.sword;

/**
 * 面试题10-2：青蛙跳台阶问题，动态规划
 * @author: xie
 * @create: 2020-03-08 22:23
 **/
public class NumWays {
    public int numWays(int n) {
        int[] a =new int[n+3];
        a[0] = 1;
        a[1] = 1;
        a[2] = 2;
        for(int i=3;i<=n;i++)
            a[i] = (a[i-1]+(a[i-2])%1000000007) % 1000000007;
        return a[n];
    }
}
