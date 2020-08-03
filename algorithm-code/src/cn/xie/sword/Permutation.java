package cn.xie.sword;

import java.util.*;

/**
 * @author: xie
 * @create: 2020-06-09 22:14
 **/
public class Permutation {
   List<String> res = new ArrayList<>();
   char[] c ;

    public String[] permutation(String s) {
       c=s.toCharArray();
       dfs(0);
       return res.toArray(new String[res.size()]);
    }

    void dfs(int x){
        if(x==c.length-1){
            res.add(String.valueOf(c));
            return;
        }
        HashSet<Character> set = new HashSet<>();

        for(int i = x; i<c.length;i++){
            if(set.contains(c[i]))
                continue;
            set.add(c[i]);
            swap(i,x);
            dfs(x+1);
            swap(i,x);
        }
    }
    void swap(int i, int x) {
        char temp = c[i];
        c[i] = c[x];
        c[x] = temp;
    }
}
