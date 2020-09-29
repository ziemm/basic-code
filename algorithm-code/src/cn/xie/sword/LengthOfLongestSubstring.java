package cn.xie.sword;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author: xie
 * @create: 2020-07-24 21:10
 **/
public class LengthOfLongestSubstring {
//    public int lengthOfLongestSubstring(String s) {
//        int ans = 0,start = -1; //start用来记录滑动窗口的开始位置
//        Map<Character,Integer> map = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            char k = s.charAt(i);
//            if(map.containsKey(k)){
//                //如果遇到重复字符，就更新
//                int index = map.get(k); //index为上一次重复字符串的位置
//                if(index>start)start=index;
//            }
//            map.put(k,i);
//            ans = Math.max(ans,i-start);
//        }
//        return ans;
//    }

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
