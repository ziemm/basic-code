package cn.itcast.day07.demo06_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * 统计一个字符串中每个字符出现次数。
 * @author: xie
 * @create: 2019-09-15 13:18
 **/
public class MapStatisticString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = scan.next();


        HashMap<Character, Integer> map = new HashMap<>();
        for (char key : str.toCharArray()) {   //char[] array = str.toCharArray();
            if (map.containsKey(key)) {
                Integer value = map.get(key) + 1;
                map.put(key, value);
            } else {
                map.put(key, 1);
            }
        }

        /*Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        System.out.println("每个字符出现的次数为：");
        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }*/
        for (Character key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));

        }

    }
}
