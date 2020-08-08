package cn.xie.sword;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author: xie
 * @create: 2020-08-08 20:58
 **/
public class IsStraight {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int zeroCount = 0,diff=0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==0){
                zeroCount++;
            }else {
                if(nums[i]==nums[i+1])  return false; //有重复的牌，肯定不是
                if(nums[i]+1!=nums[i+1]){
                    diff+=nums[i+1]-nums[i]-1;
                }
            }
        }
        return zeroCount>=diff;
    }
}
