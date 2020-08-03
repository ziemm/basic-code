package cn.xie.demo18_singleton.demo02_lazy;

/**
 *
 * @author: xie
 * @create: 2020-04-23 09:25
 **/
public class Singleton {
    private static Singleton instance = null;
    private Singleton(){};
    public static Singleton newInstance(){
        if(null==instance){
            instance=new Singleton();
        }
        return instance;
    }
}
