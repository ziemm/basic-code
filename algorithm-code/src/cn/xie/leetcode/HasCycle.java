package cn.xie.leetcode;

import cn.xie.ListNode;

/**
 * @author: xie
 * @create: 2020-08-26 21:38
 **/
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null)
            return false;
        ListNode p1 = head.next;
        ListNode p2 = head;
        while (p1 !=null && p1.next !=null){
            if(p1 == p2)
                return true;
            p1 = p1.next.next;
            p2 = p2.next;
        }
        return false;
    }
}
