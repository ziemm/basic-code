package cn.xie.nowcoder;

import java.util.ArrayList;

/**
 * @author: xie
 * @create: 2020-12-11 19:36
 **/
public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        if(array.length<2)
            return res;
        int i =0,j=array.length-1;
        while (i<j){
            if(array[i]+array[j]==sum){
                res.add(array[i]);
                res.add(array[j]);
                break;
            }else if(array[i]+array[j]<sum){
                i++;
            }else {
                j--;
            }
        }
        return res;
    }
}
