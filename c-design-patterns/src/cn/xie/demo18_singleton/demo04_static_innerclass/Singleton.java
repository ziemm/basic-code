package cn.xie.demo18_singleton.demo04_static_innerclass;

/**
 * @author: xie
 * @create: 2020-04-23 09:45
 **/
public class Singleton {
    public static class SingletonHolder{
        public static Singleton instance = new Singleton();
    }
    private Singleton(){}
    public static Singleton newInstance(){
        return SingletonHolder.instance;
    }

}
