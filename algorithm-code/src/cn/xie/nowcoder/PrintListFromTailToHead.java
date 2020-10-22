package cn.xie.nowcoder;

import cn.xie.ListNode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author: xie
 * @create: 2020-10-22 22:19
 **/
public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        if(listNode==null)
            return res;
        while (listNode!=null){
            res.add(listNode.val);
            listNode = listNode.next;
        }

        Collections.reverse(res);
        return res;
    }
}
