package cn.itcast.day09.demo02Reflection;

import java.lang.reflect.Method;

/**
 * @author: xie
 * @create: 2020-02-18 19:29
 **/
public class Demo04GetMethod {

    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;

        //获取方法
        Method eat_Method =personClass.getMethod("eat");
        //执行方法
         Person p = new Person();
        //eat_Method.invoke(p);

//        Method eat_Method2 =personClass.getMethod("eat",String.class);
//        eat_Method2.invoke(p,"饭");

        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

    }

}
