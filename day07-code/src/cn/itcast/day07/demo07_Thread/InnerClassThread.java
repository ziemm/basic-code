package cn.itcast.day07.demo07_Thread;

/**
 * 匿名内部类的方式
 * @author: xie
 * @create: 2019-10-03 16:03
 **/
public class InnerClassThread {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread()+""+i);
                }
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread()+"简写"+i);
                }
            }
        }).start();


    }
}
