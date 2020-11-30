package cn.xie.sword;

import java.util.HashMap;
import java.util.Map;

/**
 * 方法1：使用hashmap存储每一个节点的clone，然后将每一个节点的clone根据原节点的信息连接起来
 * 方法2：复制每一个节点的信息，放在当前节点的后面。然后原生节点的指向任意节点，使复制的节点也都指向某一任意节点。最后再重新连接原节点，克隆节点也连接起来。（书写三个函数）
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
