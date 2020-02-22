package cn.xie.leetcode;

/**
 * 两数相加2
 *
 * @author: xie
 * @create: 2020-02-06 20:27
 **/
public class AddTwoNumbers {

    //节点数据结构
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }


  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      if(l2==null){//只有l1链表
          return l1;
      }else if(l1==null&&l2!=null){//只有l2链表
          return l2;
      }else {//加法的规则，关键是进位函数
          l1.val=l1.val+l2.val;
          jinwei(l1);
          l1.next=addTwoNumbers(l1.next,l2.next);
          return l1;
      }
    }

    public void jinwei(ListNode l1) {
        if(l1.val>9){//当l1得到的数大于9之后就需要进位
            if(l1.next==null){
                l1.next=new ListNode(l1.val/10);
            }else {
                l1.next.val=l1.next.val+l1.val/10;
                jinwei(l1.next);//可能会连续进位，所以需要用到递归
            }
            l1.val %=10;//取余才是节点最终的数
        }
    }
}
