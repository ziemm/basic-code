package cn.xie.demo2;

import java.util.concurrent.CountDownLatch;

/**
 * @author: xie
 * @create: 2020-05-22 14:24
 **/
public class JoinCountDownLatch {
    private static volatile CountDownLatch countDownLatch = new CountDownLatch(2);

    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    countDownLatch.countDown();
                }
                System.out.println("child threadOne over");
            }
        });

        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    countDownLatch.countDown();
                }
                System.out.println("child threadTwo over");
            }
        });

        threadOne.start();
        threadTwo.start();

        countDownLatch.await();//主线程等待子线程完毕

        System.out.println("all child thread over!");
    }
}
