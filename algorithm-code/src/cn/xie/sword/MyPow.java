package cn.xie.sword;

/**
 * 快速幂
 * @author: xie
 * @create: 2020-05-12 18:20
 **/
public class MyPow {
    public static void main(String[] args) {
        System.out.println((-3)/2);
    }

    public double myPow(double x, int n) {

        if(n==0)return 1;
        if(n==1)return x;
        if(n==-1)return 1/x;
        if(n%2==0){
            double temp = myPow(x,n/2);
            return temp*temp;
        }else {
            double temp = myPow(x,n/2);
            if(n<0) x=(1/x);
            return temp*temp*x;
        }

    }
}
