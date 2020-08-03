package cn.xie.sword;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xie
 * @create: 2020-08-01 23:12
 **/
public class FindContinuousSequence {
    public static void main(String[] args) {
        FindContinuousSequence o = new FindContinuousSequence();
        int[][] continuousSequence = o.findContinuousSequence(9);
        System.out.println(continuousSequence.length);
    }
    public int[][] findContinuousSequence(int target) {
        List<int[]> coll= new ArrayList<>();

        if(target<3)
            return null;
        int small = 1,big=2;
        int mid = (1+target)/2; //移动增加到(1+target)一半就好了
        int curSum = small+big;
        while (small<mid){
            if(curSum==target){
                List temp = new ArrayList();
                for(int i = small;i<=big;i++){
                    temp.add(i);
                }
                int[] array = cast(temp);
                coll.add(array);
            }
            while (curSum>target && small<mid){
                curSum-= small;
                small++;
                if(curSum==target){
                    List<Integer> temp = new ArrayList();
                    for(int i = small;i<=big;i++){
                        temp.add(i);
                    }
                    int[] array = cast(temp);
                    coll.add(array);
                }
            }
            big++;
            curSum += big;
        }
      return coll.toArray(new int[coll.size()][]);
    }

    public int[] cast(List<Integer> list){
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i]=list.get(i);
        }
        return array;
    }
}
