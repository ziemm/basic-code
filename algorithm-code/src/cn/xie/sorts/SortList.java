package cn.xie.sorts;

import cn.xie.ListNode;

/**
 * @author: xie
 * @create: 2020-09-21 09:21
 **/
public class SortList {
    public ListNode sortList(ListNode head) {
        //1、递归结束条件
        if (head == null || head.next == null)
            return head;
        //2、找到链表的中间节点断开链表 & 递归下探
        ListNode midNode = middleNode(head);
        ListNode rightHead = midNode.next; //记录中间节点的又节点
        midNode.next = null; //断开

        //递归排序左右两边
        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);

        //3、当前层的业务操作
        return mergeTwoList(left, right);
    }

    /*合并两个有序链表*/
    private ListNode mergeTwoList(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode p = res;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

        p.next = l1 != null ? l1 : l2;

        return res.next;
    }

    /*找到链表的中间节点*/
    private ListNode middleNode(ListNode head) {
        if (head == null || head.next == null)
            return head;

        //使用快慢指针找到中间节点
        ListNode slow = head;
        ListNode fast = head.next.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
