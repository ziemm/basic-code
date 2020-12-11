package cn.xie.sorts;

/**
 * @author: xie
 * @create: 2020-12-07 22:36
 **/
public class BinarySearch {

    public int bSearch(int[] nums, int target) {
        int left =0,right = nums.length-1;
        while (left<=right){
            int mid = (right + left) / 2;
            if(nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1; // 注意
            else if (nums[mid] > target)
                right = mid - 1; // 注意
        }
        return -1;
    }
}
