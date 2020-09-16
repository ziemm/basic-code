package cn.xie.leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author: xie
 * @create: 2020-09-15 16:39
 **/
public class RestaurantMaxProfit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] desk = new int[n];//桌子数组
            for (int i = 0; i < desk.length; i++) {
                desk[i] = sc.nextInt();
            }
            Arrays.sort(desk);
            PriorityQueue<Cusmtomer> pq = new PriorityQueue<>();//按照消费金额降序排列
            for (int i = 0; i < m; i++) {
                int b = sc.nextInt();
                int c = sc.nextInt();
                if (b <= desk[n - 1])
                    pq.add(new Cusmtomer(b, c));//如果人数小于桌子最大容量，加入优先队列
            }
            boolean[] visited = new boolean[n];
            long sum = 0;//记录总盈利
            int count = 0; //记录已使用的桌子数;
            while (!pq.isEmpty()) {
                Cusmtomer cusmtomer = pq.poll();
                for (int i = 0; i < n; i++) {//为客人分配桌子
                    if(cusmtomer.peopleCount<=desk[i] && !visited[i]){
                        visited[i] = true;
                        sum += cusmtomer.moneyCount;
                        count++;
                        break;
                    }
                }
                if(count==n) break;
            }
            System.out.println(sum);
        }
    }

    static class Cusmtomer implements Comparable<Cusmtomer> {
        private final int peopleCount;
        private final int moneyCount;

        public Cusmtomer(int peopleCount, int moneyCount) {
            this.peopleCount = peopleCount;
            this.moneyCount = moneyCount;
        }

        @Override
        public int compareTo(Cusmtomer o) {
            if (o.moneyCount > this.moneyCount) return 1;
            else if (o.moneyCount < this.moneyCount) return -1;
            else return 0;
        }
    }
}
