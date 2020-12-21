package cn.xie.nowcoder;

/**
 * @author: xie
 * @create: 2020-12-18 09:40
 **/
public class Sum {
    int res =0;
    public int Sum_Solution(int n) {
        boolean x = (n>1)&&Sum_Solution(n-1)>0;
        res += n;
        return res;
    }
}
