package cn.xie.nowcoder;

/**
 * @author: xie
 * @create: 2020-11-12 10:12
 **/
public class MyPower {
    public double Power(double base, int exponent) {
        if (base==0)
            return 0;
        if(exponent==0)
            return 1;
        if(exponent==1)
            return base;
        if(exponent==-1)
            return 1/base;
        if(exponent%2==0){
            double tem = Power(base, exponent/2);
            return tem*tem;
        } else {
            double tem = Power(base, exponent/2);
            if(exponent<0)
                base = (1/base);
            return tem*tem*base;
        }
    }
}
