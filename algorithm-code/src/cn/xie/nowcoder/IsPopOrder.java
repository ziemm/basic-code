package cn.xie.nowcoder;

import java.util.Stack;

/**
 * JZ21,栈的压入、弹出序列
 * 设置一个辅助栈模拟栈的压入，
 * 如果压入的数==弹出的序列，则弹出数字，并循环这个操作；
 * 如果压入的数！=当前的弹出序列，则继续压栈。
 * 最后辅助栈要是空的，则返回true
 * @author: xie
 * @create: 2020-11-20 20:29
 **/
public class IsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (int num : pushA) {
            stack.push(num);
            while (!stack.isEmpty()&&stack.peek()==popA[i]){
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }
}
