package cn.xie.sword;

/**
 * 利用短路&&来进行递归算
 * @author: xie
 * @create: 2020-08-09 14:01
 **/
public class SumNums {
    public static void main(String[] args) {
        SumNums obj = new SumNums();
        int i = obj.sumNums(6);
        System.out.println(i);
    }
    int res = 0;
    public int sumNums(int n){
        boolean x = (n>1) && sumNums(n-1)>0;
        res += n;
        return res;
    }
}
