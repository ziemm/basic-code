package cn.xie.demo18_singleton.demo02_lazy;

/**
 * 懒汉加载优化：加锁保证线程同步
 * @author: xie
 * @create: 2020-04-23 09:32
 **/
public class Singleton1 {
    private static Singleton1 instance = null;
    private Singleton1(){};
    public static synchronized Singleton1 newInstance(){
        if(null==instance){
            instance = new Singleton1();
        }
        return instance;
    }
}
