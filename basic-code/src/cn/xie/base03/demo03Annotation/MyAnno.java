package cn.xie.base03.demo03Annotation;

/**
 * 注解的本质是一个接口
 */
public @interface MyAnno {

    //注解的返回值类型
    int age() ;
    String name() default "张三";

   Person per();//枚举类型的定义方式
//
    MyAnno2 anno2();

    //及以上类型的数组
    String[] strs() default "de";
}
