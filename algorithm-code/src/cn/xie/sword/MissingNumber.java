package cn.xie.sword;

/**
 * 二分法定位到要找的数
 * @author: xie
 * @create: 2020-07-29 21:43
 **/
public class MissingNumber {
    public int missingNumber(int[] nums) {
        if(nums==null || nums.length<=0)
            return -1;
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if(nums[mid]!=mid){//说明此时可能为该数。但还需进一步判断
                if(mid==0 || nums[mid-1]==mid-1)
                    return mid;
                right =mid-1; //要找的数在mid左边
            }
            else{
                left= mid+1;
            }
        }
        if(left==nums.length)
            return nums.length;
        return -1;
    }
}
