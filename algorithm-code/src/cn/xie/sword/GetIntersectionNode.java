package cn.xie.sword;

/**
 * @author: xie
 * @create: 2020-07-28 21:42
 **/
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int length1 = getListLength(headA);
        int length2 = getListLength(headB);
        int diff = length1 - length2;

        ListNode listLong = headA;
        ListNode listShort = headB;
        if (diff < 0) {
            //说明第一个链表较短
            listLong = headB;
            listShort = headA;
            diff = -diff;
        }
        //长链表先走相差步数
        for (int i = 0; i < diff; i++) {
            listLong = listLong.next;
        }
        //走过后进行对比
        while (listLong != null && listShort != null && listLong != listShort) {
            listLong = listLong.next;
            listShort = listShort.next;
        }
        //得到第一个公共节点
        ListNode commonNode = listLong;
        return commonNode;
    }

    public int getListLength(ListNode head) {
        int length = 0;
        ListNode p = head;
        while (p != null) {
            ++length;
            p = p.next;
        }
        return length;
    }

    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        ListNode h1 = headA, h2 = headB;
        while (h1 != h2) {

            h1 = h1 == null ? headB : h1.next;
            h2 = h2 == null ? headA : h2.next;
        }

        return h1;
    }
}
