package cn.xie.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 3.最长无重复子串
 *  利用滑动窗口的方法，维护一个队列，
 * @author: xie
 * @create: 2020-02-20 22:31
 **/
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
    }

    /**
     * [i,j)一直+j，j不包含在里面，就加进去，若包含就移动i，对每个i都是如此
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {

        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans =0,i=0,j=0;
        while (i<n&&j<n){
            if(!set.contains(s.charAt(j))){//如果不包含
                set.add(s.charAt(j++));
                ans=Math.max(ans,j-i);
            }else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;

    }

    /**
     * 优化方法：
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring2(String s) {


        int n = s.length();
        int ans =0;

        Map<Character,Integer> map = new HashMap<>(); //定义字符到索引的映射
        for (int j =0,i=0;j<n;j++){
            if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)),i);
            }
            ans=Math.max(ans,j-i+1);
            map.put(s.charAt(j),j+1);
        }
        return ans;
    }
}
