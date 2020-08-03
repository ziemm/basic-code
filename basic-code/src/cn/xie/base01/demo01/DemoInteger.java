package cn.xie.base01.demo01;

/**
 * @author: xie
 * @create: 2020-05-27 10:37
 **/
public class DemoInteger {
    public static void main(String[] args) {
//        Integer i1 = 100;
//        Integer i2 = 100;
//
//        Integer i3 =200;
//        Integer i4 =200;
//
//        System.out.println(i1==i2);
//        System.out.println(i3==i4);

        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        Long h = 2L;

        Integer i = 3;

        System.out.println(c==d);  //true
        System.out.println(e==f);  //false
        System.out.println(c==(a+b)); //true  由于有算术运算，会触发自动拆箱，比较数值是否相等
        System.out.println(c.equals(a+b)); //true 会先各自调用intValue方法，得到了加法运算后的数值之后，便调用Integer.valueOf方法，再进行equals比较
        System.out.println(g==(a+b)); //true
        System.out.println(g.equals(a+b)); //false
        System.out.println(g.equals(a+h)); //true

        System.out.println(g.equals(i));  //false  不同类型相同数值也是false



    }
}
