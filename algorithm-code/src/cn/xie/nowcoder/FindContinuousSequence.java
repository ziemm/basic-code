package cn.xie.nowcoder;

import java.util.ArrayList;

/**
 * @author: xie
 * @create: 2020-12-10 10:10
 **/
public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(sum<3)
            return res;
        int i =1,j=2;

        while (i<(sum+1)/2){//两个数相加和为s，若较小的数在中位数之后，那么和就一定大于s，所以这里让i<中位数就好了。
                            // ps：奇数的中位数可以（s+1）/2
            int curSum = 0;
            for (int k = i; k <=j ; k++) {
                curSum+=k;
            }
            if(curSum<sum){
                j++;
            }else if(curSum>sum){
                i++;
            }else {
                ArrayList<Integer> tmp = new ArrayList<>();
                for (int k = i; k <=j ; k++) {
                    tmp.add(k);
                }
                res.add(tmp);
                j++;
            }
        }
        return res;
    }
}
