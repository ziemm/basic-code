package cn.xie;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xie
 * @create: 2020-04-27 18:19
 **/
public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] array = new int[]{11,33,4,5,7,7,2,76,776,13};

        s.reOrderArray(array);
    }

    public void reOrderArray(int[] array){
        List<Integer> even = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                even.add(array[i]);
            }else {
                array[j]=array[i];
                j++;
            }
        }

        for (Integer integer : even) {
            array[j]=integer;
            j++;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
