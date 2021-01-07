package cn.xie.nowcoder;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: xie
 * @create: 2020-12-20 18:44
 **/
public class Duplicate {
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        if (numbers == null || numbers.length == 0)
            return false;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            if (set.contains(numbers[i])) {
                duplication[0] = numbers[i];
                return true;
            } else {
                set.add(numbers[i]);
            }
        }
        return false;
    }

    /**
     * 利用特性，“归位的思想”，让第m个数回归到第m位，如果下一个数与第m为相等了，则说明重复
     * @param numbers
     * @param length
     * @param duplication
     * @return
     */
    public boolean duplicate1(int numbers[], int length, int[] duplication) {
        if (numbers == null || numbers.length == 0)
            return false;
        for (int i = 0; i < numbers.length; i++) {
            while (numbers[i]!=i){
                if(numbers[i]==numbers[numbers[i]]){
                    duplication[0]=numbers[i];
                    return true;
                }
                //交换
                int temp = numbers[i];
                numbers[i] = numbers[temp];//归位操作
                numbers[temp]=temp;
            }
        }
        return false;
    }
}
