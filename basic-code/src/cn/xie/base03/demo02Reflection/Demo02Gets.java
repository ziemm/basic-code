package cn.xie.base03.demo02Reflection;

import java.lang.reflect.Method;

/**
 *
 * * 获取功能：
 * 			1. 获取成员变量们
 * 				* Field[] getFields() ：获取所有public修饰的成员变量
 * 				* Field getField(String name)   获取指定名称的 public修饰的成员变量
 *
 * 				* Field[] getDeclaredFields()  获取所有的成员变量，不考虑修饰符
 * 				* Field getDeclaredField(String name)
 * 			2. 获取构造方法们
 * 				* Constructor<?>[] getConstructors()
 * 				* Constructor<T> getConstructor(类<?>... parameterTypes)
 *
 * 				* Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
 * 				* Constructor<?>[] getDeclaredConstructors()
 * 			3. 获取成员方法们：
 * 				* Method[] getMethods()
 * 				* Method getMethod(String name, 类<?>... parameterTypes)
 *
 * 				* Method[] getDeclaredMethods()
 * 				* Method getDeclaredMethod(String name, 类<?>... parameterTypes)
 *
 * 			4. 获取全类名
 * 				* String getName()
 * @author: xie
 * @create: 2019-10-14 20:46
 **/
public class Demo02Gets {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;

//        Field[] personClassFields = personClass.getFields();
//
//        for (Field field : personClassFields) {
//            System.out.println(field);
//        }
//        Field mouth = personClass.getField("mouth");
//        System.out.println(mouth);
//        System.out.println("-------------------------");
//
//        Field[] declaredFields = personClass.getDeclaredFields();
//        for (Field declaredField : declaredFields) {
//            System.out.println(declaredField);
//        }
//
//        Field name = personClass.getDeclaredField("name");
//
//        Person p = new Person();
//        name.setAccessible(true); //暴力反射
//        Object value = name.get(p);
//        System.out.println(value);




//        Constructor constructor = personClass.getConstructor(String.class);
//        System.out.println(constructor);
//        //利用构造器创建对象
//        Object person = constructor.newInstance("zhangsan");
//        //System.out.println(person);
//        Object o = personClass.newInstance();
//        Constructor constructor1 = personClass.getConstructor();
//        Object o1 = constructor1.newInstance();
//        System.out.println(o);
//        System.out.println(o1);


        Method eat = personClass.getMethod("eat");
        Person p = new Person();
        eat.invoke(p);

        Method eat1 = personClass.getMethod("eat", String.class);
        eat1.invoke(p,"热狗");  //成员变量、成员方法通过反射使用，需要传递具体对象的参数


    }
}
