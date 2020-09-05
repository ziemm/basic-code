package cn.xie.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author: xie
 * @create: 2020-08-27 09:52
 **/
public class MaxInWindow {
    public ArrayList<Integer> maxInWindows(int [] num, int size){
        LinkedList<Integer> dqueue = new LinkedList<>(); //单调队列，记录下标
        ArrayList<Integer> res = new ArrayList<>();
        if(num==null || size<= 0 || size >num.length)
            return res;
        for (int i = 0; i < num.length; i++) {
            while(!dqueue.isEmpty() && num[dqueue.peekLast()]<=num[i]){ //如果元素比当前队列尾部大，就替掉尾部元素
                dqueue.pollLast();
            }
            dqueue.addLast(i);
            if(dqueue.peekFirst()==i-size-1+1){
                //滑动窗口的尾部略过队列头部
                dqueue.pollFirst();
            }
            if(i>= (size-1)){//窗口成形
                res.add(num[dqueue.peekFirst()]);
            }
        }
        return res;
    }
}
