package cn.xie.sword;

/**
 * @author: xie
 * @create: 2020-07-27 21:26
 **/
public class FirstUniqChar {
    public char firstUniqChar(String s) {
        int[] dir = new int[26];
        if(s.equals(""))
            return ' ';
        for (int i = 0; i < s.length(); i++) {
            dir[s.charAt(i)-'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if(dir[s.charAt(i)-'a']==1) return s.charAt(i);
        }
        return ' ';
    }
}
