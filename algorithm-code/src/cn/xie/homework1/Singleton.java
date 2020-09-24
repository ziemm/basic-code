package cn.xie.homework1;

/**
 * @author: xie
 * @create: 2020-09-22 20:25
 **/
public class Singleton {
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
