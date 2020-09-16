package cn.xie.leetcode;

import java.util.*;

/**
 * @author: xie
 * @create: 2020-09-16 09:15
 **/
public class TopKFrequent {

    public static void main(String[] args) {
     int[] nums = new int[] {1,1,2,3,4,4,4,};
        List<Integer> integers = topKFrequent(nums,3);
        System.out.println(integers);


//        List<Integer> list = new ArrayList<>();
//        for (int num : nums) {
//            list.add(num);
//        }
//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });
//        System.out.println(list.toString());

    }
    public static List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1)-map.get(o2);
            }
        });
        for (Integer num : map.keySet()) {
            if(pq.size()<k){
               pq.add(num);
            }
            else if(map.get(num)>map.get(pq.peek())){
                pq.remove();
                pq.add(num);
            }
        }
        while (!pq.isEmpty()){
            list.add(pq.poll());
        }

        Collections.reverse(list);
        return list;

        //return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
