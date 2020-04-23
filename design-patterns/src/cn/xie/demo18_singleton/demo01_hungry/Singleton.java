package cn.xie.demo18_singleton.demo01_hungry;

/**
 *  类加载时候就创建，避免了线程同步问题
 * @author: xie
 * @create: 2020-04-23 09:23
 **/
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton(){};
    public static Singleton newInstance(){
        return instance;
    }

}
