package com.xie.invokedynamic;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;

import static java.lang.invoke.MethodHandles.lookup;

/**
 * @author: xie
 * @create: 2020-03-31 08:50
 **/
public class MethodHandleTest {
    static class ClassA{
        public void println(String s){
            System.out.println(s);
        }
    }

    public static void main(String[] args) throws Throwable {
        Object obj = System.currentTimeMillis()%2==0?System.out:new ClassA();
        /*无论最终是哪个实现类，下面这句都能调用到println方法*/
        getPrintMH(obj).invokeExact("icyfenix");
    }

    private static MethodHandle getPrintMH(Object receiver) throws Throwable{
        //methodType代表“方法类型”，包含了方法放入返回值和具体参数
        MethodType mt = MethodType.methodType(void.class, String.class);
        /*lookup方法来自于MethodHandlers.lookup 作用是在指定类中查找给定的方法名称，方法类型，并且复合调用权限的方法句柄*/
        /*调用的是虚方法，原来隐式调用的第一个参数：this指向的对象，现在提供BindTo方法来完成*/
        return lookup().findVirtual(receiver.getClass(),"println",mt).bindTo(receiver);
    }
}
