package cn.xie.homework2;


import cn.xie.ListNode;

/**
 * @author: xie
 * @create: 2020-09-20 14:05
 **/
public class HaoWeiLai02 {

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
