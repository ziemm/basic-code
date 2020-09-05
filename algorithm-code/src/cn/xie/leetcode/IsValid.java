package cn.xie.leetcode;

import java.util.Stack;

/**
 * 括号的完全匹配
 * @author: xie
 * @create: 2020-08-13 21:19
 **/
public class IsValid {
    public boolean IsValidExp (String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        if(s==null||s=="")
            return false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=' '){
                /*是([{的话，push它们的右括号，若下一个是和他们右括号相等则清掉，不等则直接返回错误*/
                if(arr[i]=='(')
                    stack.push(')');
                else if(arr[i]=='{')
                    stack.push('}');
                else if(arr[i]=='[')
                    stack.push(']');
                else if(stack.isEmpty()||arr[i]!=stack.pop()) return false;
            }
        }
        return stack.isEmpty();
    }
}
