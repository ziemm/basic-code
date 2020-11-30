package cn.xie.nowcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * @author: xie
 * @create: 2020-11-25 10:05
 **/
public class Permutation {
    ArrayList<String> res = new ArrayList<>();
    char[] c;
    public ArrayList<String> Permutation(String str) {
        c = str.toCharArray();
        dfs(0);
        Collections.sort(res);
        return res;
    }

    private void dfs(int x) {
        if(x==c.length-1){
            res.add(String.valueOf(c));
            return;
        }
        //防止同一层递归出现重复元素
        HashSet<Character> set = new HashSet<>();
        for (int i = x; i < c.length; i++) {
            if(set.contains(c[i]))
                continue;
            set.add(c[i]);
            swap(i,x);
            dfs(x+1);
            swap(i,x);
        }
    }

    private void swap(int i, int x) {
        char temp = c[i];
        c[i] = c[x];
        c[x] = temp;
    }
}
