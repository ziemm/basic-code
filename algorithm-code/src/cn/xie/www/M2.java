package cn.xie.www;

import java.text.DecimalFormat;
import java.util.*;

/**
 * @author: xie
 * @create: 2019-10-28 08:53
 **/
public class M2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        Queue<Integer> q= new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }
        double score =0;
        for (int i = 1; i <= n; i++) {
            int temp =q.poll();
            q.offer(q.poll());
            score+=(temp%i);
        }

        DecimalFormat df = new DecimalFormat("#");
        System.out.println(df.format(score));
    }
}
