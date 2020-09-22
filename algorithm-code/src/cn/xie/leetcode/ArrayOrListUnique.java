package cn.xie.leetcode;

import cn.xie.ListNode;

import java.util.Arrays;

/**
 * @author: xie
 * @create: 2020-09-21 11:27
 **/
public class ArrayOrListUnique {
    public static void main(String[] args) {

        ListNode node01 = new ListNode(1);
        ListNode node02 = new ListNode(1);
        ListNode node03 = new ListNode(1);
        ListNode node04 = new ListNode(3);
        ListNode node05 = new ListNode(3);
        ListNode node06 = new ListNode(4);
        ListNode node07 = new ListNode(6);
        node01.next = node02;
        node02.next = node03;
        node03.next = node04;
        node04.next = node05;
        node05.next = node06;
        node06.next = node07;
        ListNode p = node01;
//        while (p!=null){
//            System.out.println(p.val);
//            p = p.next;
//        }

        ListNode uNode = listToUnique(node01);
        while (uNode!=null){
            System.out.println(uNode.val);
            uNode = uNode.next;
        }

    }

    public static int[] arrayToUnique(int[] nums) {
        if (nums == null)
            return null;
        int slow = 0;
        int fast = 1;
        while (fast < nums.length) {
            if (nums[slow] != nums[fast]) {
                //如果慢指针的值和快指针的值不相等，表示元素不重复
                slow++;
                nums[slow] = nums[fast];//把快指针的值赋给慢指针
            }
            fast++;
        }
        return Arrays.copyOfRange(nums, 0, slow + 1);
    }

    public static ListNode listToUnique(ListNode head) {
        if (head == null)
            return null;
        ListNode p = head;
        while (p.next != null) {
            while (p.val == p.next.val) {
                p.next = p.next.next; //如果当前节点的值等于下一个节点的值，当前节点的下一个节点=当前节点的下个节点的下个节点
            }
            p = p.next;
        }
        return head;
    }
}
