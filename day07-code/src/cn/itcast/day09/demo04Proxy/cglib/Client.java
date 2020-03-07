package cn.itcast.day09.demo04Proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 基于子类的动态代理
 *
 * @author: xie
 * @create: 2020-03-04 23:43
 **/
public class Client {

    public static void main(String[] args) {
        Actor actor = new Actor();
        Actor actor_cglib = (Actor) Enhancer.create(actor.getClass(), new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                String methodName = method.getName();
                Float money = (Float) objects[0];
                Object rtValue = null;
                if ("baseAct".equals(methodName)) {
                    //基本演出，没有2000不演
                    if (money > 2000) {
                        //看上去剧组是给了8000，实际到演员手里只有4000
                        //这就是我们没有修改原来basicAct方法源码，对方法进行了增强
                        rtValue = method.invoke(actor, money / 2);
                    }
                }

                if ("dangerAct".equals(methodName)) {
                    //基本演出，没有5000不演
                    if (money > 5000) {
                        //看上去剧组是给了50000，实际到演员手里只有25000
                        //这就是我们没有修改原来basicAct方法源码，对方法进行了增强
                        rtValue = method.invoke(actor, money / 2);
                        System.out.println(rtValue);
                    }
                }

                if ("specialAct".equals(methodName)) {

                    if (money > 5000) {
                        //这就是我们没有修改原来basicAct方法源码，对方法进行了增强
                        rtValue = method.invoke(actor, money / 2);
                        System.out.println(rtValue);
                    }
                }

                return rtValue;
            }
        });
        actor_cglib.baseAct(8000);
        actor_cglib.dangerAct(50000);
        actor_cglib.specialAct(10000);
    }
}
