package cn.xie.nowcoder;

import java.util.Stack;

/**
 * 使用两个栈，辅助栈记录最小值
 * @author: xie
 * @create: 2020-11-18 10:19
 **/
public class MinStack {
    Stack<Integer> A = new Stack<>();
    Stack<Integer> helper = new Stack<>();
    public void push(int node) {
        A.push(node);
        if(helper.isEmpty() || helper.peek()>node){
            helper.push(node);
        }
    }

    public void pop() {
        Integer tem = A.pop();
        if(tem==helper.peek())
            helper.pop();
    }

    public int top() {
        return A.peek();
    }

    public int min() {
        return helper.peek();
    }
}
