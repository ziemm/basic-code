package cn.xie.demo2;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: xie
 * @create: 2020-05-23 20:34
 **/
public class CycleBarrierTest1 {
    private static CyclicBarrier cyclicBarrier = new CyclicBarrier(2, new Runnable() {
        @Override
        public void run() {
            System.out.println(Thread.currentThread()+"task1 merge result");
        }
    });

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread()+"task-1");
                System.out.println(Thread.currentThread()+"enter in barrier");
                try {
                    cyclicBarrier.await();
                    System.out.println(Thread.currentThread()+"enter out barrier");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        });

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread()+"task-2");
                System.out.println(Thread.currentThread()+"enter in barrier");
                try {
                    cyclicBarrier.await();
                    System.out.println(Thread.currentThread()+"enter out barrier");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        });

        executorService.shutdown();
    }
}
