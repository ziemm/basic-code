package cn.xie.leetcode;

import cn.xie.ListNode;

import java.util.List;

/**
 * @author: xie
 * @create: 2020-09-27 13:43
 **/
public class RemoveNthFromEnd {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(--n);
    }
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        ListNode fast = head;
        ListNode slow = head;
        while (--n>0){
            fast = fast.next;
        }
        ListNode pre=null;
        while (fast.next!=null){
            pre = slow;
            slow = slow.next;
            fast = fast.next;
        }
        //删除操作
        if(pre!=null){
            pre.next=slow.next;
        }else {
            head = head.next;
        }

        return head;
    }
}
