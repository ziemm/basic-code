package cn.xie.sword;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: xie
 * @create: 2020-08-08 14:17
 **/
public class MaxQueue {
    Queue<Integer> queue;
    LinkedList<Integer> max;
    public MaxQueue() {
        queue = new LinkedList<>();
        max = new LinkedList<>(); //
    }

    public int max_value() {
        return max.size()==0?-1:max.getFirst();
    }

    public void push_back(int value) {
        queue.add(value);
        while (max.size()!=0&&max.getLast()<value){
            max.removeLast();
        }
        max.add(value);
    }

    public int pop_front() {
        if(max.size()!=0&&queue.peek().equals(max.getFirst()))
            max.removeFirst(); //如果队首出队元素是当前最大值，将max队首出队
        return queue.size()==0?-1:queue.poll();
    }
}
