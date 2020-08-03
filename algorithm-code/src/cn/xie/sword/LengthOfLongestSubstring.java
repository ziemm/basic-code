package cn.xie.sword;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: xie
 * @create: 2020-07-24 21:10
 **/
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0,start = -1; //start用来记录滑动窗口的开始位置
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char k = s.charAt(i);
            if(map.containsKey(k)){
                //如果遇到重复字符，就更新
                int index = map.get(k); //index为上一次重复字符串的位置
                if(index>start)start=index;
            }
            map.put(k,i);
            ans = Math.max(ans,i-start);
        }
        return ans;
    }
}
