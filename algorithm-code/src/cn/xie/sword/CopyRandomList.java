package cn.xie.sword;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: xie
 * @create: 2020-06-01 23:13
 **/
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class CopyRandomList {
    public Node copyRandomList(Node head) {
        Map<Node,Node> map = new HashMap<>();
        if(head==null)return null;
        Node p = head;
        //哈希表存储所有节点对
        while (p!=null){
            map.put(p,new Node(p.val));
            p=p.next;
        }

        p=head;
        while (p!=null){
            //新节点的next
            map.get(p).next=map.get(p.next);
            map.get(p).random = map.get(p.random);
            p=p.next;
        }
        return map.get(head);
    }

    /*o(n)的解法，剑指offer中无需额外空间的的解法复制+分离*/
    public Node copyRandomList2(Node head) {
        if(head==null) return null;
        clone(head);
        randomAdd(head);
        return reconnect(head);
    }

    public void clone(Node head){
        while (head!=null){
            Node clone = new Node(head.val);
            clone.next = head.next;
            head.next=clone;
            head=clone.next;
        }
    }

    public void randomAdd(Node head){
        while (head!=null){
            if(head.random!=null)head.next.random =head.random.next;
            head=head.next.next;
        }
    }

    public Node reconnect(Node head){
        Node res = head.next;
        Node tmp = res;

        head.next = head.next.next;
        head =head.next;
        while (head != null) {
            tmp.next =head.next;
            head.next =head.next.next;
            tmp = tmp.next;
            head=head.next;
        }
        return res;
    }
}
