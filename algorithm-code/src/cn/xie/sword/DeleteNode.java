package cn.xie.sword;

/**
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * @author: xie
 * @create: 2020-05-12 22:46
 **/

public class DeleteNode {

    public ListNode deleteNode(ListNode head, int val) {
            ListNode p = head;

            if(p.val==val){
                head=p.next;
                return head;
            }else {
                while (p.next!=null){
                    if(p.next.val==val){
                        p.next=p.next.next;
                        return head;
                    }
                    p=p.next;
                }

            }
        return head;
    }
}
