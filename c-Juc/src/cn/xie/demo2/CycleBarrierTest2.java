package cn.xie.demo2;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: xie
 * @create: 2020-05-23 20:46
 **/
public class CycleBarrierTest2 {
    private static CyclicBarrier cyclicBarrier = new CyclicBarrier(2);

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(new Runnable() {
            @Override
            public void run() {

                try {
                    System.out.println(Thread.currentThread()+"STEP1");
                    cyclicBarrier.await();

                    System.out.println(Thread.currentThread()+"STEP2");
                    cyclicBarrier.await();

                    System.out.println(Thread.currentThread()+"STEP3");
                    cyclicBarrier.await();

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

                try {
                    System.out.println(Thread.currentThread()+"STEP1");
                    cyclicBarrier.await();

                    System.out.println(Thread.currentThread()+"STEP2");
                    cyclicBarrier.await();

                    System.out.println(Thread.currentThread()+"STEP3");
                    cyclicBarrier.await();

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
