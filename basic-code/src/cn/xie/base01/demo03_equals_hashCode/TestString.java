package cn.xie.base01.demo03_equals_hashCode;

/**
 * @author: xie
 * @create: 2020-05-28 09:37
 **/
public class TestString {
    public static void main(String[] args) {
        String a = new String("ab");
        String b = new String("ab");
        String aa ="ab";  //放在常量池
        String bb ="ab";//在常量池中查找
        System.out.println(aa==bb);  //true
        System.out.println(a==b);  //false
        System.out.println(a.equals(b)); //true
        System.out.println(42==42.0); //true
    }
}
