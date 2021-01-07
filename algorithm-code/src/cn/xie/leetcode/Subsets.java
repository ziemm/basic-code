package cn.xie.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xie
 * @create: 2020-12-04 16:38
 **/
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> subset = new ArrayList<>();
        res.add(subset);
        preOrder(nums,0,subset,res);
        return res;
    }
    public void preOrder(int[] nums, int i, ArrayList<Integer> subset,List<List<Integer>> res){
        if(i>=nums.length)
            return;
        subset = new ArrayList<>(subset);
        res.add(subset);
        preOrder(nums,i+1,subset,res);//不选
        subset.add(nums[i]);//选
        preOrder(nums,i+1,subset,res);
    }
}
