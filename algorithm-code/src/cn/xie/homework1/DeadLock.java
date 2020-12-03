package cn.xie.homework1;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * lambda表达式写法：作为Thread对象的构造函数的一个参数
 * @author: xie
 * @create: 2020-11-30 21:38
 **/
public class DeadLock {

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
            }
            synchronized (resource2){

            }
        },"Thread1").start();

        new Thread(()->{
            synchronized (resource2){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (resource1){}
        },"Thread2").start();
    }

}
