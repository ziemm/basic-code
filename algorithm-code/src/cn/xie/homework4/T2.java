package cn.xie.homework4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: xie
 * @create: 2019-12-16 08:55
 **/
public class T2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int m =sc.nextInt();//攻击力
        int n =sc.nextInt();//血量
        int num = sc.nextInt();//敌方随从数量
        int count = 0;

        int[][] a = new int[num][2];
        for (int i = 0; i < a.length; i++) {
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
        }
        int[] temp;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if(a[j][0]>a[j+1][0]){//对攻击力进行排序，不是对血量进行排序
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            if(m<a[i][0])continue;//攻击力不足
            else if(m>=a[i][0]&&m<a[i][1])continue;//攻击力足，但杀不死
            else {//攻击力足，且能杀死
                    n=n-a[i][0];//减去对方的攻击后
                    count++;
                    if(n<=0)
                        break;
            }
        }

        System.out.println(count);
    }
}
