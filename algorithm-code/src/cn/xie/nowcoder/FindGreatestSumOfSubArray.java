package cn.xie.nowcoder;

/**
 * @author: xie
 * @create: 2020-11-29 14:09
 **/
public class FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0)
            return 0;
        int max = Integer.MIN_VALUE;
        int curSum = 0;
        for (int i = 0; i < array.length; i++) {
            curSum= Math.max(curSum+array[i],array[i]);
            max = Math.max(max,curSum);
        }
        return max;
    }
}
