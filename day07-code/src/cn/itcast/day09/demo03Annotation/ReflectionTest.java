package cn.itcast.day09.demo03Annotation;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 框架类的概念
 * 使用技术：
 *    加载配置文件
 *    利用反射
 * @author: xie
 * @create: 2019-10-14 21:42
 **/
@Pro(className = "cn.itcast.day09.demo03Annotation.Demo1",methodName = "show")
public class ReflectionTest {
    public static void main(String[] args) throws Exception {


        /*可通过注解解析的方式替换加载配置文件的步骤*/
        //1.解析注解
        //1.1获取该类的字节码文件对象
        Class<ReflectionTest> reflectionTestClass = ReflectionTest.class;
        //1.2获取上面的注解对象
        Pro an = reflectionTestClass.getAnnotation(Pro.class);
        //1.3调用注解对象中的抽象方法获取返回值
        String className = an.className();
        String methodName = an.methodName();

        //3.利用反射技术加载该类进内存
        Class cls = Class.forName(className);
        Object o = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(o);
    }



}
