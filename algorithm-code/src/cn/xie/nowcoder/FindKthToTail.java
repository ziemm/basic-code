package cn.xie.nowcoder;

import cn.xie.ListNode;

/**
 * 快慢指针，注意边界条件（1）k<=0。(2)k>链表长度。
 * @author: xie
 * @create: 2020-11-13 09:26
 **/
public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k<=0)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        while (k>1){
            fast = fast.next;
            if(fast==null)//说明k>链表长度
                return null;
            k--;
        }
        while (fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
