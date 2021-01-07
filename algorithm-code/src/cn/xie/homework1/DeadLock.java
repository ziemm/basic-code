package cn.xie.homework1;

/**
 * @author: xie
 * @create: 2020-09-30 15:23
 **/
public class DeadLock {
    public static Object source1 = new Object();
    public static Object source2 = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (source1) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (source2) {
                }
            }
        }, "Thread1").start();

        new Thread(() -> {
            synchronized (source2) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (source1) {
                }
            }
        }, "Thread2").start();
    }


}
