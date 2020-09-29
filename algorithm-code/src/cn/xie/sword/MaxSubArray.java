package cn.xie.sword;

/**
 * 最大子序列，只要前i项的和没有小于0就一直向后扩展，否则丢弃之前的子序列开始新的子序列，
 * 同时，还要记下各个子序列的和，最后找到和的最大子序列
 * @author: xie
 * @create: 2020-06-18 21:58
 **/
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        if(nums==null || nums.length<1)
            return 0;
        int current=0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
           if(current<=0)
               current=nums[i];
           else
               current+=nums[i];
           if(current>max){
               max=current;
           }
        }
        return max;
    }
}
