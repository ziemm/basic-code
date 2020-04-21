package cn.xie.demo14_adapter;

/**
 * @author: xie
 * @create: 2020-04-21 09:42
 **/
public class Client {
    public static void main(String[] args) {
        Target target  = new Adapter();
        target.request();
    }
}
