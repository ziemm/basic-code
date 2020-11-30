package cn.xie.homework1;

import java.util.*;

/**
 * @author: xie
 * @create: 2020-08-23 15:55
 **/
public class Main {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(arr.length==0 || k==0)
            return new int[0];
        PriorityQueue<Integer> pQueue = new PriorityQueue<>((v1,v2)->v2-v1);
        for (int num : arr) {
            if(pQueue.size()<k){
                pQueue.offer(num);
            }else {
                if(pQueue.peek()>num){
                    pQueue.poll();
                    pQueue.offer(num);
                }
            }
        }

        int[] res = new int[k];
        int idx =0;
        for (Integer num : pQueue) {
            res[idx++] = num;
        }
        return res;
    }
}
