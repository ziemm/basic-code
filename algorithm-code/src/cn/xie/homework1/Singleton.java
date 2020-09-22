package cn.xie.homework1;

/**
 * @author: xie
 * @create: 2020-09-17 17:14
 **/
public class Singleton {
//    private static Singleton instance = new Singleton();
//    private Singleton(){}
//    public  static Singleton newInstance(){
//        return instance;
//    }
    private static volatile Singleton instance = null;
    private Singleton(){}
    public static Singleton getInstance(){
        if(instance==null){
            synchronized (Singleton.class){
                if(instance==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
