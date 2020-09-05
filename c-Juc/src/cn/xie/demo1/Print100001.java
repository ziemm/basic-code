package cn.xie.demo1;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: xie
 * @create: 2020-08-13 10:50
 **/
public class Print100001 {
    public static AtomicInteger count = new AtomicInteger(1);
    public static volatile int n = 1;
    public static int k = 1;
    public static int synchronizedNum =1;
    public static CountDownLatch countDownLatch = new CountDownLatch(100000);
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    count.getAndIncrement();
                    n++;
                    k++;
                    increment();
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();
        System.out.println(count);
        System.out.println(n);
        System.out.println(k);
        System.out.println(synchronizedNum);
    }
    public static synchronized void increment(){
        synchronizedNum++;
    }
}
