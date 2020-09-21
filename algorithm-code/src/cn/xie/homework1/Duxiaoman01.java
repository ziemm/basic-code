package cn.xie.homework1;

import java.util.*;

/**
 * @author: xie
 * @create: 2020-09-20 20:37
 **/
public class Duxiaoman01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String xiaoming = sc.nextLine();
        String panel = sc.nextLine();
        char[] xm = xiaoming.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (char c : xm) {
            map.put(c,0);
        }

        Set<Character> set = new HashSet<>();
        char[] pl = panel.toCharArray();
        for (char c : pl) {
            set.add(c);
        }
        int count = 0;
        for (Character ch : set) {
            if(map.containsKey(ch))
                count++;
        }
        System.out.println(count);

    }
}
