package cn.xie.homework1;


import com.sun.org.apache.xml.internal.serializer.ElemDesc;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author: xie
 * @create: 2020-08-13 20:14
 **/
public class Solution {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        String _s;
        try {
            _s = in.nextLine();
        } catch (Exception e) {
            _s = null;
        }

        res = longestValidParenthe(_s);
        System.out.println(String.valueOf(res));

    }

    static int longestValidParenthe(String s) {
        int[] num = new int[s.length()];
        char[] chars = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(chars[i]=='(')
                stack.push(i);
            else if(!stack.isEmpty()){
                num[i] = 1;
                num[stack.pop()]=1;
            }
        }
        int max = 0;
        int left =0;
        int right =0;
        for (left  = 0; left <num.length ; left++) {
            if(num[left]==0)
                continue;
            right =left;
            while (right<num.length && num[right]==1){
                right++;
            }
            max = Math.max(right-left,max);
            left = right;
        }
        return max;
    }

}