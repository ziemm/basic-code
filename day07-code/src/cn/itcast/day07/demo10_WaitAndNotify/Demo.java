package cn.itcast.day07.demo10_WaitAndNotify;

/**
 * wait与notify要成对出现!
 * @author: xie
 * @create: 2019-10-03 21:06
 **/
public class Demo {
    public static void main(String[] args) {
        Baozi bz = new Baozi();
        //开启包子铺线程
        new BaoziPu(bz).start();
        //开启吃货线程
        new ChiHuo(bz).start();
    }

}
