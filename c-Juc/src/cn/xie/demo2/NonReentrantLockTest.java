package cn.xie.demo2;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.locks.Condition;

/**
 * @author: xie
 * @create: 2020-05-17 17:39
 **/
public class NonReentrantLockTest {
   final static NonReentrantLock lock = new NonReentrantLock();
   final static Condition notFull = lock.newCondition();
   final static Condition notEmpty = lock.newCondition();

   final static Queue<String> queue=new LinkedBlockingDeque<String>();
   final static int queueSize = 10;

    public static void main(String[] args) {
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                    try {

                        //队列满
                        while (queue.size()==queueSize){
                        notEmpty.await();
                        }

                        queue.add("ele");
                        //唤醒消费线程
                        notFull.signalAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally {
                        lock.unlock();
                    }
                }
        });

        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                    try {
                        while (0==queue.size()){
                        notFull.await();
                        }
                        String ele = queue.poll();
                        //唤醒生产线程
                        notEmpty.signalAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally {
                        lock.unlock();
                    }
                }
        });
    }
}
