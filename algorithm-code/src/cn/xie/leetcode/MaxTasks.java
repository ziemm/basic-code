package cn.xie.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 给你一个二维数组，每个数组记录任务的开始时间和结束时间，求完成任务的最大线程数
 * @author: xie
 * @create: 2020-10-13 21:06
 **/
public class MaxTasks {
    public static void main(String[] args) {
        //int[][] arr = {{0,30},{5,10},{15,20}};
        int[][] arr = {{7,10},{3,7}};

        int[] start = new int[arr.length];
        int[] end = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            start[i] = arr[i][0];
            end[i] = arr[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int left = start[0];
        int right = end[end.length-1];

        int count = 0,max=0;
        int index1=0,index2=0;
        for (int i = left; i <= right; i++) {
            if(i==start[index1]){
                count++;
                if(index1<start.length-1)index1++;
            }
            if(i==end[index2]){
                count--;
                if(index2<end.length-1)index2++;
            }
            max=Math.max(count,max);
        }

        System.out.println(max);
    }
}
