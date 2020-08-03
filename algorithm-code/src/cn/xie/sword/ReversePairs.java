package cn.xie.sword;

import java.util.Arrays;

/**
 * @author: xie
 * @create: 2020-07-27 22:43
 **/
public class ReversePairs {
    public int reversePairs(int[] nums){
        if(nums==null|| nums.length<=0)
            return 0;
        //复制原数组
        int[] copy = Arrays.copyOf(nums,nums.length);
        int count = reversPairsCore(nums,copy,0,nums.length-1);
        return count;
    }

    public int reversPairsCore(int[] nums,int[] copy,int start,int end){
        if(start==end){
            copy[start]= nums[start];
            return 0;
        }
        int length =(end-start)/2;
        int left = reversPairsCore(copy,nums,start,start+length);
        int right = reversPairsCore(copy,nums,start+length+1,end);
        int i = start + length;
        int j = end;
        int indexCopy = end;
        int count = 0;
        while (i>=start&&j>=start+length+1){
            if(nums[i]>nums[j]){
                copy[indexCopy--]=nums[i--];
                count+=j-start-length;  //即：j-(start+length)
            }else {
                copy[indexCopy--]=nums[j--];
            }
        }

        //可能剩一个分数组未走完
        for(;i>=start;--i)
            copy[indexCopy--] = nums[i];
        for(;j>=start+length+1;--j)
            copy[indexCopy--] = nums[j];

        return left+right+count;
    }
}
