package cn.xie.sword;

/**
 * 二分查找目标位置，然后左右遍历
 * @author: xie
 * @create: 2020-07-28 22:33
 **/
public class Search {

    public int search(int[] nums, int target) {
        int count=0;
        int left =0,right=nums.length-1;
        while (left<right){
            int mid = (left+right)/2;
            if(nums[mid]>=target) //注意是大于等于
                right=mid;
            if(nums[mid]<target)
                left=mid+1;
        }
        while (left<nums.length&&nums[left++]==target){
            count++;
        }
        return count;
    }
}
