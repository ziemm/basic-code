package cn.xie.nowcoder;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *排序后，遍历数组，再看是否有重复。如果有重复，则直接返回false（注意数组越界的问题）
 * 遍历完成后。判断最大最小之间是否相差5
 *
 * @author: xie
 * @create: 2020-12-15 09:54
 **/
public class IsContinuous {
    public static void main(String[] args) {
        int[] num = new int[]{1,3,4,2,5};
        boolean f = isContinuous(num);
        System.out.println(f);
    }
    public static boolean isContinuous(int [] numbers) {
        if(numbers==null||numbers.length<5)
            return false;
        Arrays.sort(numbers);
        int zeroCount=0;
        for (int i = 0; i < 4; i++) {
            if(numbers[i]==0)
                zeroCount++;
            else if(numbers[i]==numbers[i+1])
                return false;
        }
        return numbers[4]-numbers[zeroCount]<5;
    }

    /*方法二、使用set去重，并记录最大最小值，最后判断最大最小值*/
    public boolean isContinuous1(int [] numbers) {
        if(numbers==null||numbers.length<5)
            return false;
        Set<Integer> set = new HashSet<>();
        int max=0,min = 14;
        for (int num : numbers) {
            if(num==0)
                continue;
            max = Math.max(max,num);
            min = Math.min(min,num);
            if(set.contains(num))
                return false;
            set.add(num);
        }
        return max-min<5;
    }

}
