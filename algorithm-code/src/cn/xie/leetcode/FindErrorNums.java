package cn.xie.leetcode;

import java.util.Arrays;

/**
 * 645. 错误的集合
 * 集合 S 包含从1到 n 的整数。不幸的是，因为数据错误，导致集合里面某一个元素复制了成了集合里面的另外一个元素的值，
 * 导致集合丢失了一个整数并且有一个元素重复。
 *
 * 给定一个数组 nums 代表了集合 S 发生错误后的结果。你的任务是首先寻找到重复出现的整数，再找到丢失的整数，将它们以数组的形式返回
 * @author: xie
 * @create: 2020-11-02 14:37
 **/
public class FindErrorNums {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int dup=-1;
        int miss=1;
        int[] res = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==nums[i+1])
                dup = nums[i];
            else if(nums[i]+1<nums[i+1])
                miss=nums[i]+1;
        }
        //循环完成后，仍有可能 第二个else if 没走过 例如[1,2,3,3]
        return new int[]{dup,nums[nums.length-1]!=nums.length?nums.length:miss}; //[1,2,3,3]
    }
}
