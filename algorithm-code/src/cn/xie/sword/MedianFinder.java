package cn.xie.sword;

import java.util.PriorityQueue;

/**
 * @author: xie
 * @create: 2020-06-18 21:21
 **/
public class MedianFinder {
    /** initialize your data structure here. */
    PriorityQueue<Integer> leftHeap; //设计成大根堆
    PriorityQueue<Integer> rightHeap;  //设计成小根堆
    public MedianFinder() {
        rightHeap = new PriorityQueue<>();
        leftHeap = new PriorityQueue<>((v1,v2)->v2-v1);
    }

    public void addNum(int num) {
        leftHeap.offer(num);
        rightHeap.offer(leftHeap.poll());
        if(rightHeap.size()>leftHeap.size()){
            leftHeap.offer(rightHeap.poll());
        }
    }

    public double findMedian() {
        if(leftHeap.size()>rightHeap.size())
            return leftHeap.peek();
        else
            return (leftHeap.peek()+rightHeap.peek())/2.0;
    }
}
