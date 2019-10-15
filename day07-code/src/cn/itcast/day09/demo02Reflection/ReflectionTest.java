package cn.itcast.day09.demo02Reflection;

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
public class ReflectionTest {
    public static void main(String[] args) throws Exception {
        //1.加载配置文件
        //1.1获取Properties对象
        Properties pro = new Properties();
        //1.2 加载后转换为一个集合
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        //通过类加载器的该方法获取该文件字节流
        InputStream is = ClassLoader.getSystemResourceAsStream("pro.properties");
        pro.load(is);
        //2.获取pro文件中的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        //3.利用反射技术加载该类进内存
        Class cls = Class.forName(className);
        Object o = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(o);
    }



}
