package cn.xie.sword;

import java.util.LinkedList;

/**
 * @author: xie
 * @create: 2020-08-07 16:37
 **/
public class MaxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums ==null || nums.length<=0 || nums.length<k) return new int[0];
        int index = 0;
        int[] res = new int[nums.length-k+1];
        LinkedList<Integer> dqueue = new LinkedList<>();  //维护一个单调双端队列，头部总是存放最大的数的下标
        for (int i = 0; i < nums.length; i++) {
            while (!dqueue.isEmpty()&&nums[dqueue.peekLast()]<=nums[i]){
                dqueue.pollLast();
            }
            dqueue.addLast(i);
            //如果滑动窗口略过队列头部，让队列头部元素弹出
            if(dqueue.peekFirst()==(i-k)){
                dqueue.pollFirst();
            }
            //查看看窗口有没有成型，成形了才收集
            if(i>=(k-1)){
                res[index++] = nums[dqueue.peekFirst()];
            }
        }
        return res;
    }
}
