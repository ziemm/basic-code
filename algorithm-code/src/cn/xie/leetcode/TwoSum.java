package cn.xie.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和 1
 * map方式或者枚举方式
 * @author: xie
 * @create: 2020-02-05 21:46
 **/
public class TwoSum {
    /*使用map的方式，map的key存放当前nums[i]与target的差值，如果后续的数组中的数包含map的key就返回*/
    int[] index = new int[2];
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                index[0]=map.get(nums[i]);
                index[1]=i;
            }
            map.put(target-nums[i],i);
        }
        return index;
    }

}
