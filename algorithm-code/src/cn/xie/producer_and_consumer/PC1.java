package cn.xie.producer_and_consumer;

/**
 * @author: xie
 * @create: 2020-12-04 20:03
 **/
public class PC1 {
    private static Integer count =0;
    private static final Integer FULL =10;
    private static String LOCK = "lock";

    public static void main(String[] args) {
        PC1 pc1 = new PC1();
        new Thread(pc1.new Producer()).start();
        new Thread(pc1.new Consumer()).start();
        new Thread(pc1.new Producer()).start();
        new Thread(pc1.new Consumer()).start();
        new Thread(pc1.new Producer()).start();
        new Thread(pc1.new Consumer()).start();
        new Thread(pc1.new Producer()).start();
        new Thread(pc1.new Consumer()).start();

    }

    class Producer implements Runnable{
        @Override
        public void run() {
            synchronized (LOCK){
                while (count==FULL){
                    try {
                        LOCK.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                count++;
                System.out.println(Thread.currentThread().getName()+"生产者生产，目前总共有"+count);
                LOCK.notifyAll();
            }
        }
    }

    class Consumer implements Runnable{
        @Override
        public void run() {
            synchronized (LOCK){
                while (count==0){
                    try {
                        LOCK.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                count--;
                System.out.println(Thread.currentThread().getName()+"消费者消费，目前总共有"+count);
                LOCK.notifyAll();
            }
        }
    }
}
