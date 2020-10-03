package cn.xie.nowcoder;

import cn.xie.ListNode;

/**
 * @author: xie
 * @create: 2020-10-03 20:52
 **/
public class AddInList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(7);
        l1.next=l2;
        l2.next=l3;

        ListNode r1 = new ListNode(6);
        ListNode r2 = new ListNode(2);
        r1.next = r2;

        ListNode res = addInList(l1, r1);

        while (res!=null){
            System.out.print(res.val+" ");
            res = res.next;
        }
    }
    public static ListNode addInList(ListNode head1, ListNode head2) {
        // write code here
        ListNode l1 = reverseList(head1);
        ListNode l2 = reverseList(head2);
        ListNode res = new ListNode(-1);
        ListNode p = res;
        int jw = 0;
        while (l1 != null && l2 != null) {
            int tmp = l1.val + l2.val + jw;
            if (tmp <= 9) {
                jw = 0;
                ListNode node = new ListNode(tmp);
                p.next = node;
                p = node;
                l1 = l1.next;
                l2 = l2.next;
            } else {
                jw = 1;
                ListNode node = new ListNode(tmp % 10);
                p.next = node;
                p = node;
                l1 = l1.next;
                l2 = l2.next;
            }
        }

        while(l1!=null){
            int tmp = l1.val +jw;
            if(tmp<=9){
                jw = 0;
                ListNode node = new ListNode(tmp);
                p.next = node;
                node.next = l1.next;
                break;
            }else {
                jw = 1;
                ListNode node = new ListNode(tmp%10);
                p.next = node;
                p =node;
                node.next = l1.next;
                l1 = l1.next;
            }
        }

        while(l2!=null){
            int tmp = l2.val +jw;
            if(tmp<=9){
                jw = 0;
                ListNode node = new ListNode(tmp);
                p.next = node;
                node.next = l1.next;
                break;
            }else {
                jw = 1;
                ListNode node = new ListNode(tmp%10);
                p.next = node;
                p =node;
                node.next = l2.next;
                l2= l2.next;
            }
        }
        res = res.next;
        res = reverseList(res);
        if(jw == 1){
            ListNode node = new ListNode(1);
            node.next=res;
            res =node;
        }
        return res;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode p=head,pre=null,w=null;
        while (p!=null){
            w=p.next;
            p.next=pre;
            pre=p;
            p=w;
        }
        return pre;
    }
}
