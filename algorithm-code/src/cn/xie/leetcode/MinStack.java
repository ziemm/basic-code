package cn.xie.leetcode;

import java.util.Stack;

/**
 * 155.最小栈
 * 设计一个min变量 记录最小值，遇到更小的值时就将当期的最小值入栈
 * @author: xie
 * @create: 2020-02-05 20:14
 **/
public class MinStack {

    private Stack<Integer> stack;
    private int min =Integer.MAX_VALUE;
    public MinStack() {
       stack = new Stack<Integer>();
    }

    public void push(int x) {
        if(min>=x){
            stack.push(min);
            min=x;
        }
        stack.push(x);
    }

    public void pop() {      //之前为了更新min要push两次的时候，在该pop方法中已经使用了两次pop方法
        if(stack.pop()==min){
            //如果弹出的值是最小值，那么将下一个元素更新为最小值
            min=stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
