package cn.xie.homework1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

/**
 * @author: xie
 * @create: 2020-08-23 15:55
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("heo");
    }
    public boolean isValid (String s) {
        if(s==null || s.length() ==0)
            return false;
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='[')
                stack.push(']');
            else if(chars[i]=='{')
                stack.push('}');
            else if(chars[i]=='(')
                stack.push(')');
            else if(stack.isEmpty() || chars[i] !=stack.pop())
                return false;
        }
        return stack.isEmpty();
    }
}
