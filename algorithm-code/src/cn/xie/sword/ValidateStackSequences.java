package cn.xie.sword;

import java.util.Stack;

/**
 * @author: xie
 * @create: 2020-05-25 19:56
 **/
public class ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i =0;
        for (int num : pushed) {
            stack.push(num);
            while (!stack.isEmpty()&&stack.peek()==popped[i]){
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }
}
