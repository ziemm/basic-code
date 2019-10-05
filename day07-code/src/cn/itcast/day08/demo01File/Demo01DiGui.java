package cn.itcast.day08.demo01File;

/**
 * 递归求和
 * @author: xie
 * @create: 2019-10-04 21:44
 **/
public class Demo01DiGui {
    public static void main(String[] args) {
//        int s = getSum(100);
//        System.out.println(s);

        int s1 = JieCheng(15);
        System.out.println(s1);
    }

    //求和的递归
    public static int getSum(int n){
        if(n ==1){
            return 1;
        }
        return n + getSum(n-1);
    }

    //阶乘的递归
    public static int JieCheng(int n){
        if(n == 1){
            return 1;
        }
        return n*JieCheng(n-1);
    }
}
