package cn.xie.demo18_singleton;

/**
 * @author: xie
 * @create: 2020-04-23 08:45
 **/
class Singleton {
    private static Singleton instance;
    private Singleton(){};

    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}
