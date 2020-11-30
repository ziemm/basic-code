package cn.xie.nowcoder;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author: xie
 * @create: 2020-11-26 14:15
 **/
public class GetLeastNumbers {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(input==null||k==0||k>input.length)
            return list;
        int[] res = quickSearchK(input, 0, input.length - 1, k-1);

        for (int i = 0; i < res.length; i++) {
            list.add(res[i]);
        }
        return list;
    }

    public int[] quickSearchK(int[] input,int low,int high,int k){
        int j = partition(input, low, high);
        if(j==k)
            return Arrays.copyOf(input,j+1);
        return j>k? quickSearchK(input,low,j-1,k):quickSearchK(input,j+1,high,k);

    }

    public int partition(int[] input,int low,int high){
        int pivot = input[low];
        while (low<high){
            while (low<high && input[high]>=pivot)high--;
            input[low]=input[high];
            while (low<high && input[low]<=pivot)low++;
            input[high]=input[low];
        }
        input[low]=pivot;
        return low;
    }
}
