package cn.xie.base03.demo04Proxy.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 使用动态代理的方式说明
 *
 * @author: xie
 * @create: 2020-03-01 23:12
 **/
public class Client {
    public static void main(String[] args) {
        //剧组找演员
        Actor actor = new Actor();

        IActor proxy_Actor = (IActor) Proxy.newProxyInstance(  //创建的代理对象
                actor.getClass().getClassLoader(),//和被代理对象使用相同的类加载器
                actor.getClass().getInterfaces(),//和被代理对象具有相同的行为。实现相同接口
                new InvocationHandler() {//如何代理（如何增强方法）
                    /**
                     * 执行被代理对象的任何方法，都会经过该方法。
                     * 此方法有拦截的功能。
                     *
                     * 参数：
                     *  proxy：代理对象的引用。不一定每次都用得到
                     *  method：当前执行的方法对象
                     *  args：执行方法所需的参数
                     * 返回值：
                     *  当前执行方法的返回值(即当前被代理方法的返回值)
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        String methodName = method.getName();
                        Float money = (Float) args[0];
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


        //没有经纪公司的时候，直接找演员。
        //actor.baseAct(1000f);
        //actor.dangerAct(5000f);


        //剧组无法联系演员，而是由经济公司联系演员
        proxy_Actor.baseAct(8000f);
        proxy_Actor.dangerAct(50000f);
        float v = proxy_Actor.specialAct(30000);
        //System.out.println(v);
    }

}
