package cn.xie.sorts;

import cn.xie.ListNode;

/**
 * 合并有序链表的非递归形式
 * 空间复杂度为O（1）
 *
 * @author: xie
 * @create: 2020-09-21 10:21
 **/
public class SortList1 {
    public ListNode sortList(ListNode head) {
        int n = 0;
        //走到null刚好走链表长度
        for (ListNode i = head; i != null; i = i.next) n++;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        //第一层循环，分块，从1个一块，2个一块，4个一块，直到n个一块
        for (int i = 1; i < n; i = 2 * i) {
            ListNode begin = dummy;
            //开始归并
            //j+i >=n 表示只有一段就就不归并了
            for (int j = 0; j + i < n; j = j + 2 * i) {
                //两块，找两块起始节点
                //开始都指向第一块的起点
                //然后second走n步后指向第二块的起点
                ListNode first = begin.next;
                ListNode second = first;
                for (int k = 0; k < i; k++) second = second.next;

                //遍历第一块和第二块进行归并
                //第一块的数量为i
                //第二块的数量为i也可能不为i。故循环条件要加一个second !=null
                int f = 0,s=0;
                while (f<i && s<i && second !=null){
                    if(first.val <second.val){
                        begin.next = first;
                        begin = begin.next;
                        first = first.next;
                        f++;
                    }else {
                        begin.next =second;
                        begin = begin.next;
                        second = second.next;
                        s++;
                    }
                }
                //归并后可能有多余的没有处理
                while (f<i){
                    begin.next = first;
                    begin = begin.next;
                    first = first.next;
                    f++;
                }
                while (s<i && second!=null){
                    begin.next = second;
                    begin = begin.next;
                    //second已经更新到下一个节点了
                    second = second.next;
                    s++;
                }

                //更新begin
                //begin.next指向下一块的起点
                begin.next = second;

            }

        }
        return dummy.next;

    }
}
