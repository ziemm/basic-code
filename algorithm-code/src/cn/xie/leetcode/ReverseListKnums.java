package cn.xie.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: xie
 * @create: 2020-11-15 20:49
 **/
class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
        next = null;
    }
}
public class ReverseListKnums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListNode head,p,tail;
        head = tail = null;
        int n = sc.nextInt();
        int N =sc.nextInt();
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            p = new ListNode(data);
            p.val = data;
            if(head==null){
                head = tail =p;
            }else {
                tail.next =p;
                tail = p;
            }
        }
        int[] res = solution(head, N);
        for (int i = 0; i < res.length-1; i++) {
            System.out.print(res[i]+"-");
        }
        System.out.println(res[res.length-1]);
    }
    public static int[] solution(ListNode head,int N){
        ListNode p=head,pre=null,w=null;
        while (N-->=0){
            w=p.next;
            p.next=pre;
            pre=p;
            p=w;
        }
        head =p;
        List<Integer> res= new ArrayList<>();
        while (pre!=null){
            res.add(pre.val);
            pre = pre.next;
        }
        while (head!=null){
            res.add(head.val);
            head = head.next;
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
