package cn.xie.leetcode;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 349. 两个数组的交集
 * 给定两个数组，编写一个函数来计算它们的交集。
 * @author: xie
 * @create: 2020-11-02 20:49
 **/
public class Intersection {
    /*双set*/
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1==null || nums1.length==0||nums2==null || nums2.length==0)
            return new int[0];
        HashSet<Integer> parent = new HashSet<>();
        HashSet<Integer> child = new HashSet<>();
        for (int num : nums1) {
            parent.add(num);
        }
        for (int num : nums2) {
            if(parent.contains(num)){
                child.add(num);
            }
        }

        return child.stream().mapToInt(Integer::intValue).toArray();
    }

    /*双指针，需事先排序*/
    public int[] intersection1(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i =0,j=0;
        while (i<nums1.length && j< nums2.length){
            if(nums1[i]==nums2[j]){
                set.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else if(nums1[i]>nums2[j]) {
                j++;
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

}
