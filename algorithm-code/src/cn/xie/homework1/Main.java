package cn.xie.homework1;


import java.util.HashSet;
import java.util.Set;

/**
 * @author: xie
 * @create: 2020-08-23 15:55
 **/
public class Main {
    public static void main(String[] args) {
        int size = 1;
        while (size-- > 0) {
            System.out.println(size);
        }
    }

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        int right = 0;
        char[] chars = s.toCharArray();
        while (right<chars.length){
            if(!set.contains(chars[right])){
                set.add(chars[right]);
                right++;
            }else {
                while (chars[left]!=chars[right]){
                    set.remove(chars[left]);
                    left++;
                }
                left++;
                right++;
            }
            maxLength = Math.max(maxLength,right-left);
        }
        return maxLength;
    }


}
