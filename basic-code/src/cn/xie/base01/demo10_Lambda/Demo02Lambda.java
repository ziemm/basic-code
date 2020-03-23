package cn.xie.base01.demo10_Lambda;

/**
 * @author: xie
 * @create: 2019-10-03 22:31
 **/
public class Demo02Lambda {
    public static void main(String[] args) {
        //使用匿名内部类实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"开始执行！");
            }
        }).start();
        //使用Lambda
        new Thread(()->System.out.println(Thread.currentThread().getName()+"开始执行！")).start();

    }

}
