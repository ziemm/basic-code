package cn.xie.leetcode;

/**
 * 三次翻转
 * @author: xie
 * @create: 2020-08-10 21:27
 **/
public class Rotate {
    public void rotate(int[] nums, int k) {
        if(nums==null || nums.length<=0 || k<0)
            return;
        int n = nums.length;
        k %= n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    private void reverse(int[] nums,int start,int end){
        while (start<end){
            int temp = nums[start];
            nums[start++]=nums[end];
            nums[end--] = temp;
        }
    }
}
