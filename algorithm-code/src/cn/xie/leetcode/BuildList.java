package cn.xie.leetcode;

/**
 * @author: xie
 * @create: 2020-11-15 21:10
 **/
public class BuildList {
    public static void main(String[] args) {
        tailInsert();
        headInsert();
    }

    public static void tailInsert(){
        int n = 5;
        ListNode head=null,p,tail;
        head=tail=null;
        /*尾插法逻辑*/
        for (int i = 0; i < n; i++) {
            p = new ListNode(i);
            if(head==null){
                head = tail = p;
            }else {
                tail.next = p;
                tail = p;
            }
        }
        while (head!=null){
            System.out.print(head.val+" ");
            head = head.next;
        }
    }

    public static void headInsert(){
        int n = 5;
        ListNode head=null,p = null;
        for (int i = 0; i < n; i++) {
            p = new ListNode(i);
            p.next =head;
            head = p;
        }
        while (head!=null){
            System.out.print(head.val+" ");
            head = head.next;
        }
    }
}
