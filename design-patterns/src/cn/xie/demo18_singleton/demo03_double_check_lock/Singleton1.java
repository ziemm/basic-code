package cn.xie.demo18_singleton.demo03_double_check_lock;

/**
 * @author: xie
 * @create: 2020-04-23 09:40
 **/
public class Singleton1 {
    private static volatile Singleton1 instance = null; //加volatile关键字 优化双重校验锁，方式是阻止JVM内部重排序

    private Singleton1() {
    }

    public static Singleton1 newInstance() {
        if (instance == null) {
            synchronized (Singleton1.class) {
                if (instance == null) {//2
                    instance = new Singleton1();
                }
            }
        }
        return instance;
    }
}
