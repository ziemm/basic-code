package cn.itcast.day09.demo02Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author: xie
 * @create: 2020-02-18 19:19
 **/
public class Demo3GetConstructor {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取类对象
        Class personClass = Person.class;

        //获取构造方法
//        Constructor[] constructors = personClass.getConstructors();
//        System.out.println(constructors);

//        Constructor constructor = personClass.getConstructor(String.class);
//        System.out.println(constructor);

        Constructor constructor = personClass.getConstructor(String.class);
        //创建对象
        Object zhangsan = constructor.newInstance("zhangsan");
        System.out.println(zhangsan);


    }

}
