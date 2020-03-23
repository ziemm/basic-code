package cn.xie.base02.demoMethodReference;

/**
 * @author: xie
 * @create: 2019-10-13 14:01
 **/
public class Demo02Calcable {
    public static void method(int num,Calcable lamdba){
        System.out.println(lamdba.calc(num));
    }

    public static void main(String[] args) {
        method(-10,n -> {
            return Math.abs(n); });

        //优化
        method(-10,Math::abs);
    }

}
