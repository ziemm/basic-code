package cn.xie.nowcoder;

import java.util.LinkedList;

/**
 * 模拟删除的过程。注意index的初值以及删除一个元素后index需要回退一下
 * @author: xie
 * @create: 2020-12-17 10:03
 **/
public class LastRemaining {
    public int LastRemaining_Solution(int n, int m) {
        if(n==0||m==0)
            return -1;
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int index = -1;
        while (list.size()>1){
            index = (index+m)%(list.size());
            list.remove(index);
            index--;
        }
        return list.get(0);
    }
}
