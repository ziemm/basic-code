package cn.xie.demo1;

/**
 * @author: xie
 * @create: 2020-08-07 14:24
 **/
public class DeadLockDemo {
    private static Object resource1 = new Object();
    private static Object resource2 = new Object();

    public static void main(String[] args) {
        new Thread(()->{
            synchronized (resource1){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource2){
                }
            }
        },"线程1").start();

        new Thread(() -> {
            synchronized (resource2) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource1) {
                }
            }
        }, "线程 2").start();
    }
}
