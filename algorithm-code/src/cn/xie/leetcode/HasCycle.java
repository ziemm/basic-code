package cn.xie.leetcode;

import cn.xie.ListNode;

/**
 * @author: xie
 * @create: 2020-08-26 21:38
 **/
public class HasCycle {
    public boolean hasCycle(ListNode head){
        if(head==null || head.next==null)
            return false;
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast!=null && fast.next!=null){
            if(slow==fast)
                return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
