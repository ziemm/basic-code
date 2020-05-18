package cn.xie.sword;

/**
 * @author: xie
 * @create: 2020-05-17 21:46
 **/
public class ReverseList {

    public ListNode reverseList(ListNode head) {
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
