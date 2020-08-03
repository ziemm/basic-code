package cn.xie.sword;

/**
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
