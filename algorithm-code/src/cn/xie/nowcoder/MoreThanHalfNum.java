package cn.xie.nowcoder;

/**
 * 最快的方法是摩尔投票法
 * @author: xie
 * @create: 2020-11-26 10:26
 **/
public class MoreThanHalfNum {
    public int MoreThanHalfNum_Solution(int [] array) {
        int res = array[0];
        int votes = 0;
        for (int i = 0; i < array.length; i++) {
            if(votes==0)
                res=array[i];
            if(array[i]==res)
                votes++;
            else
                votes--;
        }
        //校验，保证确实是超过数组的一半
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==res) count++;
            if(count>array.length/2)
                return res;

        }
        return 0;
    }
}
