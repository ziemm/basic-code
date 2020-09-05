package cn.xie.leetcode;

import java.util.Stack;

/**
 * @author: xie
 * @create: 2020-08-15 21:18
 **/
public class SortedStack {
    private Stack<Integer> data = new Stack<>();
    private Stack<Integer> helper = new Stack<>();
    public SortedStack() {
    }

    public void push(int val) {
        if(isEmpty()){
            data.push(val);
            while (!helper.isEmpty()){
                data.push(helper.pop());
            }
        }else {
            int top = peek();
            if(top>=val){
                data.push(val);
                while (!helper.isEmpty()){
                    data.push(helper.pop());
                }
            }else {
                helper.push(data.pop());
                push(val);
            }
        }
    }

    public void pop() {
        if(!isEmpty())
            data.pop();
    }

    public int peek() {
        if(isEmpty())
            return -1;
        else
            return data.peek();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }
}
