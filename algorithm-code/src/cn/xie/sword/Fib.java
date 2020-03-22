package cn.xie.sword;

/**
 * 面试题10-1 斐波那切数列
 *
 * 递归容易溢出，使用空间换时间方法利用数组记录临时变量，使得算法复杂度为o(n)
 *
 * @author: xie
 * @create: 2020-03-08 21:53
 **/
public class Fib {
    public static void main(String[] args) {
        Fib o = new Fib();
        int result = o.fib(5);
        System.out.println(result);
    }

    public int fib(int n) {
       int[] f = new int[n+2];
       f[0]=0;
       f[1]=1;
        for (int i = 2; i <= n; i++) {
          f[i] = ((f[i-1]+f[i-2]) % 1000000007)%1000000007;
        }
        return f[n];
    }
}
