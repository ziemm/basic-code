package cn.xie.demo2;

import java.util.concurrent.locks.LockSupport;

/**
 * @author: xie
 * @create: 2020-05-17 13:26
 **/
public class Park {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("child thread park");
                //调用park，挂起自己，只有被中断后才会循环退出
                while (!Thread.currentThread().isInterrupted()){
                    LockSupport.park();
                }
                System.out.println("child thread unpark");
            }
        });

        thread.start();
        Thread.sleep(1000);
        System.out.println("main thread begin unpark");

        thread.interrupt();
        //LockSupport.unpark(thread);//此时不会结束
    }
}
