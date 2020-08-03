package cn.xie.sword;

import java.util.Stack;

/**
 * @author: xie
 * @create: 2020-05-23 22:07
 **/
public class MinStack {
    Stack<Integer> A,B;
    public MinStack() {
        A = new Stack<>();
        B = new Stack<>();
    }

    public void push(int x) {
        A.add(x);
        if(B.empty()||B.peek()>x)
            B.add(x);
        else
            B.add(B.peek());
    }

    public void pop() {
        if(A.pop().equals(B.peek()));
        B.pop();
    }

    public int top() {
        return A.peek();
    }

    public int min() {
        return B.peek();
    }
}
