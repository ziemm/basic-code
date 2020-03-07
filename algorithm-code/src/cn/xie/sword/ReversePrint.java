package cn.xie.sword;

/**06.从尾到头打印链表
 * @author: xie
 * @create: 2020-03-01 19:51
 **/

import java.util.Stack;

/**
 * java语言的单链表
 */
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
    }
}
public class ReversePrint {
    public static void main(String[] args) {

        ListNode link =new ListNode(1);
        ListNode b =new ListNode(3);
        link.next=b;
        ListNode c =new ListNode(2);
        b.next=c;
        c.next=null;

        ReversePrint o = new ReversePrint();
        int[] ints = o.reversePrint(link);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    /**
     * 利用栈存放从前到后的顺序
     * @param head
     * @return
     */
    public int[] reversePrint(ListNode head) {
        Stack<Integer> s = new Stack<>();
        ListNode p =head;
        int length = 0;
        while (p!=null){
            s.push(p.val);
            p=p.next;
            length++;
        }

        int[] arr =new int[length];
        length=0;
        while (!s.isEmpty()){
            arr[length++]=s.pop();
        }
        return arr;
    }

}
