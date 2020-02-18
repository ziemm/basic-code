package cn.itcast.day09.demo03Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;

/**
 * 测试jdk中预定义的一些注解
 * @author: xie
 * @create: 2020-02-18 16:43
 **/
@SuppressWarnings("all") //压制警告信息
public class AnnoDemo2 {

    @Override  //是否继承自父类检查
    public String toString() {
        return super.toString();
    }

    @Deprecated

    public void show1(){
        //过时的方法，但是还能用，用注解标注出来
    }

    public void show2(){
        //替代show1方法
    }

    public void demo(){
        show1();
        Date date =new Date();
    }
}
