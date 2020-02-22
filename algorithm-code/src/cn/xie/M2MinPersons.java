package cn.xie;

import java.util.Scanner;

/**
 * 题目描述
 * 　　天下会评选一级弟子，（做出10题以上的有机会参加评选）。
 * 最后评选结果神风堂有超过P%但不足Q%的人被评上了（弟子一：听起来像是URAL上的1011。风：闭嘴！！！）。
 * 现在给你P和Q，你要算出神风堂最少有多少人。（数据弱了一点，所以好通过）。
 * <p>
 * 输入数据
 * 两个实数 P ， Q 。用空格隔开。每个数最多有两位小数。 0.00≤ p< q≤ 99.99
 * 输出数据
 * 神风堂最少的人数。
 * 样例输入
 * 13 14.1
 * 样例输出
 * 15
 *
 * @author: xie
 * @create: 2019-10-24 09:24
 **/
public class M2MinPersons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       double p = sc.nextDouble();
       double q = sc.nextDouble();
        p /= 100;
        q /= 100;
        for (int i = 1; i < 100000; i++) {
            if ((int) (i * q - 0.000001) - (int) (i * p + 0.000001) >= 1) {
                System.out.println(i);
                break;
            }
        }

    }

}


