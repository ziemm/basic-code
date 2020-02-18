package cn.xie.www.leetcode;

import java.util.HashMap;

/**
 * 两数之和 1
 * map方式或者枚举方式
 * @author: xie
 * @create: 2020-02-05 21:46
 **/
public class TwoSum {
    int[] index = new int[2];
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                index[0]=i;
                index[1]=map.get(nums[i]);
            }
            map.put(target-nums[i],i);
        }
        return index;
    }


    /*public int[] twoSum(int[] nums, int target) {
     int[] index = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j >i ; j--) {
                if(target==nums[i]+nums[j]){
                    index[0]=i;
                    index[1]=j;

                }
            }
        }
        return index;
    }*/
}
