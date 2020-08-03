package cn.xie.sword;

import java.util.PriorityQueue;

/**
 * 使用堆来实现
 * @author: xie
 * @create: 2020-06-18 20:51
 **/
public class GetLeastNumbers2 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(k==0||arr.length==0){
            return new int[0];
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((v1, v2) -> v2 - v1);
        for (int num : arr) {
            if(pq.size()<k){
                pq.offer(num);
            }else if(num<pq.peek()) {
                pq.poll();
                pq.offer(num);
            }
        }

        //返回堆中最小的元素
        int[] res = new int[pq.size()];
        int idx= 0;
        for (int num : pq) {
            res[idx++]=num;
        }
        return res;
    }
}
