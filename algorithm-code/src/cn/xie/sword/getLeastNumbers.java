package cn.xie.sword;

import java.util.Arrays;

/**
 * @author: xie
 * @create: 2020-06-16 22:34
 **/
public class getLeastNumbers {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(k<=0||arr.length==0)
            return new int[0];
        return quickSearchK(arr,0,arr.length-1,k-1);
    }

    private int[] quickSearchK(int[] num,int low,int high,int k){
        int j = partition(num,low,high);
        if(j==k){
            return Arrays.copyOf(num,j+1);
        }
        return j>k? quickSearchK(num,low,j-1,k):quickSearchK(num,j+1,high,k);
    }

    /*记住以数组为参数输入的快排写法*/
    private int partition(int[] num,int low,int high){
        int pivot= num[low];
        while (low<high){
            while (low<high&&num[high]>=pivot)high--;
            num[low]=num[high];
            while (low<high&&num[low]<=pivot)low++; //
            num[high]=num[low];
        }
        //low与high相遇时
        num[low]=pivot;
        return low;
    }
}
