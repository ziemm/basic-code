package cn.xie.base01.demo07_Exception;

import java.util.Objects;

/**
 * @author: xie
 * @create: 2019-10-02 20:17
 **/
public class Demo04Objects {
    //判断传递的对象是否为null的快捷方法 Objects.requireNonNull()

    public static void main(String[] args) {
        method(null);
    }

    public static void method(Object obj){
        Objects.requireNonNull(obj,"传递的对象时null");

    }
}
