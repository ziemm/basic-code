package cn.xie.nowcoder;

import java.util.HashMap;
import java.util.Map;

/**
 * 方法1：使用hashmap存储每一个节点的clone，然后将每一个节点的clone根据原节点的信息连接起来
 * 方法2：复制每一个节点的信息，放在当前节点的后面。然后原生节点的指向任意节点，使复制的节点也都指向某一任意节点。最后再重新连接原节点，克隆节点也连接起来。（书写三个函数）
 * @author: xie
 * @create: 2020-11-23 09:45
 **/
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
public class CloneRandomListNode {
    public RandomListNode Clone(RandomListNode pHead) {
        Map<RandomListNode,RandomListNode> map = new HashMap<>();
        RandomListNode p = pHead;
        while (p!=null){
            map.put(p,new RandomListNode(p.label));
            p=p.next;
        }
        p=pHead;
        while (p!=null){
            map.get(p).next = map.get(p.next);
            map.get(p).random = map.get(p.random);
            p = p.next;
        }
        return map.get(pHead);
    }

    /*方法二*/
    public RandomListNode Clone1(RandomListNode pHead) {
        if(pHead==null)
            return null;
        clone(pHead);
        randomAdd(pHead);
        return reconnect(pHead);
    }
    public void clone(RandomListNode pHead){
        while (pHead!=null){
            RandomListNode clone = new RandomListNode(pHead.label);
            clone.next=pHead.next;
            pHead.next=clone;
            pHead=clone.next;
        }
    }
    //随机指针的添加
    public void randomAdd(RandomListNode pHead){
        while (pHead!=null){
            if(pHead.random!=null)pHead.next.random=pHead.random.next;
            pHead = pHead.next.next;
        }
    }

    public RandomListNode reconnect(RandomListNode pHead){
        RandomListNode res = pHead.next;
        RandomListNode tem = res;

        pHead.next = pHead.next.next;
        pHead = pHead.next;

        while (pHead!=null){
            tem.next = pHead.next;
            pHead.next = pHead.next.next;
            tem = tem.next;
            pHead = pHead.next;
        }
        return res;
    }
}
