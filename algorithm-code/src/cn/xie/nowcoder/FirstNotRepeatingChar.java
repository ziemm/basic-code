package cn.xie.nowcoder;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author: xie
 * @create: 2020-12-02 09:52
 **/
public class FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        if (str == null || str.length() == 0)
            return -1;
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if(map.get(c)==1)
                return i;
        }
        return -1;
    }
}
