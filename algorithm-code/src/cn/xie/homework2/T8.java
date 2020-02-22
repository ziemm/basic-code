package cn.xie.homework2;

import java.util.Scanner;

/**
 * 可怜的Oliver
 * @author: xie
 * @create: 2019-11-24 09:59
 **/
public class T8  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[20001];//记录每个作业开始的时间
        int[] b = new int[20001];//记录作业持续的时间
        int[] f = new int[20001];//dp
        int n;//原计划玩的时间
        int k;//作业总的个数
        n=sc.nextInt();
        k=sc.nextInt();
        //输入数据
        for (int i = 1; i <=k ; i++) {
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        int j = k;
        for (int i = n; i >=1; i--) {
            while(a[j]>i)--j;//第j个作业开始时间>剩余时间，第j个作业无法完成，减少一个作业
            if(a[j]!=i)f[i]=f[i+1]+1;//累积剩余时间
            else{
              while (a[j]==i){//当第j个作业开始时间=剩余时间
                  if (f[i+b[j]]>f[i]){//如果dp[]剩余时间+作业持续时间>剩余时间
                      f[i] = f[i+b[j]];//状态转移:剩余时间-作业持续时间
                  }
                  --j;
              }
            }
        }
        System.out.println(f[1]);

    }
}
