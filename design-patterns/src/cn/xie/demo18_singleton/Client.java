package cn.xie.demo18_singleton;

/**
 * @author: xie
 * @create: 2020-04-23 08:48
 **/
public class Client {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1==s2);
    }
}
