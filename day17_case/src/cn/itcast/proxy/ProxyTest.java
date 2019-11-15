package cn.itcast.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: xie
 * @create: 2019-11-14 22:36
 **/
public class ProxyTest {
    public static void main(String[] args) {
        //1.创建真实对象
        Lenovo lenovo = new Lenovo();
        //2.动态代理真实对象
    /*
    *  三个参数：
                1. 类加载器：真实对象.getClass().getClassLoader()
                2. 接口数组：真实对象.getClass().getInterfaces()
                3. 处理器：new InvocationHandler()
    * */
        SaleComputer proxy_lenovo  =(SaleComputer) Proxy.newProxyInstance(lenovo.getClass().getClassLoader(), lenovo.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

//                System.out.println("代理模式的invoke方法执行了...");
//                System.out.println(method.getName());
//                System.out.println(args[0]);

                //代理增强方法
                //判断是否是sale方法
                if(method.getName()=="sale"){
                    //可以增强参数
                    double money = (double)args[0];
                    money=money*0.85;
                    //增强方法体
                    System.out.println("专车接你...");
                    //使用真实对象调用该方法
                    String obj = (String)method.invoke(lenovo, money);
                    //可以增强返回值
                    return obj+"_鼠标垫";
                }else{
                    Object obj = method.invoke(lenovo, args);
                    return obj;
                }
            }
        });

        //调用方法
        String computer = proxy_lenovo.sale(8000);
        System.out.println(computer);

    }



}
