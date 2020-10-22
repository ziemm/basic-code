package cn.xie.homework1;


import cn.xie.ListNode;

import java.util.*;

/**
 * @author: xie
 * @create: 2020-08-23 15:55
 **/
public class Main {
    public static void main(String[] args) {
        String str = null;
        str.charAt(1);
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new LinkedList<>();
        int len = nums.length;
        for(int i=0; i<len-3; i++){
            if(i>0 && nums[i-1]==nums[i])
                continue;
            for(int j=i+1; j<len-2; j++){
                if(j>i+1 && nums[j-1]==nums[j])
                    continue;
                int left = j+1;
                int right = len-1;
                if(nums[i]>target)
                    continue;
                while(left<right){
                    //    System.out.println(i+" "+j+" "+left+" "+right);
                    int sum = nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        List<Integer> res = new LinkedList<>();
                        res.add(nums[i]);
                        res.add(nums[j]);
                        res.add(nums[left]);
                        res.add(nums[right]);
                        lists.add(res);
                        while(left < right && nums[left+1]==nums[left]) left++;
                        while(right > left && nums[right-1]==nums[right]) right--;
                        left++;
                        right--;
                        //  System.out.println(i+" "+j+" "+left+" "+right);

                    }else if(sum<target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return lists;
    }
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null)
            return null;
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast){
                slow = head;
                while (slow!=fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }


}
