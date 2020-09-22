package cn.xie.sword;

/**
 * @author: xie
 * @create: 2020-05-17 22:53
 **/
public class MergeTwoLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       ListNode p=null;
       ListNode result = new ListNode(0);
       p=result;
       while (l1!=null&&l2!=null){
           if(l1.val<=l2.val){
               p.next=l1;
               p= p.next;
               l1=l1.next;
           }else {
               p.next=l2;
               p=p.next;
               l2=l2.next;
           }
       }
       if(l1!=null)
           p.next=l1;
       if(l2!=null)
           p.next=l2;

       return result.next;
    }

//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//       if(l1==null)return l2;
//       if(l2==null)return l1;
//       if(l1.val<=l2.val){
//           l1.next=mergeTwoLists(l1.next,l2);
//           return l1;
//       }else {
//           l2.next=mergeTwoLists(l1,l2.next);
//           return l2;
//       }
//    }
}
