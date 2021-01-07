package cn.xie.nowcoder;

import cn.xie.ListNode;

/**
 * @author: xie
 * @create: 2020-10-10 20:54
 **/
public class FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while (p1!=p2){
            if(p1!=null)p1=p1.next;
            if(p2!=null)p2=p2.next;
            if(p1!=p2){
                if(p1==null)p1=pHead2;
                if(p2==null)p2=pHead1;
            }
        }
        return p1;
    }
}
