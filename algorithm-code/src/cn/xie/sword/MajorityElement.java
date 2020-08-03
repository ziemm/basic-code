package cn.xie.sword;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: xie
 * @create: 2020-06-10 22:25
 **/
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2};

        MajorityElement o = new MajorityElement();
        int i = o.majorityElement(nums);
        System.out.println(i);
    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        int res = 0;
        for (Integer ele : map.keySet()) {
            if (map.get(ele) > nums.length / 2) {
                res = ele;
                break;
            }
        }
        return res;
    }

    /*摩尔投票法*/
    public int majorityElement2(int[] nums) {
        int res = nums[0];
        int votes = 0;

        for (int i = 0; i < nums.length; i++) {
            if(votes==0){
                res = nums[i];
            }
            if(nums[i]==res)
                votes++;
            else
                votes--;
        }
        return res;
    }
}
