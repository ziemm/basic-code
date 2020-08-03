package cn.xie.sword;

/**
 * @author: xie
 * @create: 2020-08-01 22:39
 **/
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if(nums==null || nums.length<=0) return null;
        int left = 0,right = nums.length-1;
        int[] res = new int[2];
        while (left<right){
            if(nums[left]+nums[right]==target){
                res[0]=nums[left];
                res[1]=nums[right];
                return res;
            }else if(nums[left]+nums[right]>target){
                right--;
            }else {
                left++;
            }
        }
        return null;
    }
}
