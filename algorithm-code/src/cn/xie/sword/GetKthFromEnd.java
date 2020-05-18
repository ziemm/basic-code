package cn.xie.sword;

/**
 * @author: xie
 * @create: 2020-05-17 21:31
 **/
public class GetKthFromEnd {

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode p,q;
        p=head;
        q=head;

        for (int i = 0; i < k-1; i++) {
            p=p.next;
        }

        while (p.next!=null){
            p=p.next;
            q=q.next;
        }
        return q;
    }
}
