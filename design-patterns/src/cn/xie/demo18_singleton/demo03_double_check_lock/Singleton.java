package cn.xie.demo18_singleton.demo03_double_check_lock;

/**
 * 双重校验锁
 * @author: xie
 * @create: 2020-04-23 09:36
 **/
public class Singleton {
    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton newInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {//2
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}