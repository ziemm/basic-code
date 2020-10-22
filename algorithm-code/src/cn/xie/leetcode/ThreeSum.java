package cn.xie.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: xie
 * @create: 2020-10-07 19:49
 **/
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        int len = nums.length;
        if(len<3)
            return lists;
        Arrays.sort(nums);
        for (int i = 0; i < len - 2; i++) {
            if(i!=0 && nums[i]==nums[i-1])
                continue;
            if(nums[i]+nums[i+1]+nums[i+2]>0)
                break;
            int left = i+1;
            int right = len-1;
            for(;left<len-1;left++){
                if(left!=i+1 && nums[left]==nums[left-1])
                    continue;
                while (left<right && nums[i]+nums[left]+nums[right]>0)right--;
                if(left>=right)
                    break;
                if(0==nums[i]+nums[left]+nums[right]){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    lists.add(list);
                }
            }
        }
        return lists;
    }
}
