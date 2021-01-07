package cn.xie.homework2;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author: xie
 * @create: 2020-09-24 20:01
 **/
public class Vipkid01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = calculate(s);
        System.out.println(ans);
    }

    public static int calculate(String s) {
        int res = 0, d = 0;
        char sign = '+';
        Stack<Integer> nums = new Stack<> ();
        for (int i = 0; i < s.length(); i++) {
            //加减乘除和空格的ASCII码都小于'0'
            if (s.charAt(i) >= '0'){
                d = d * 10 + s.charAt(i) - '0';
            }
            if((s.charAt(i) < '0' && s.charAt(i)!=' ') || i == s.length() - 1){
                if (sign == '+') {
                    nums.push(d);
                } else if (sign == '-') {
                    nums.push(-d);
                } else if (sign == '*' || sign == '/'){
                    int temp = sign == '*' ? nums.pop() * d : nums.pop() / d;
                    nums.push(temp);
                }
                sign = s.charAt(i);
                d = 0;
            }
        }
        for(int t : nums){
            res += t;
        }
        return res;
    }

}
