package cn.xie.demo1;

//都是juc里面的包
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * wait被唤醒后，是接着上次的地方运行
 *
 */
public class Print04_abc_Rlock_condition {
    private static volatile int flag = 1;//1代表 A, 2--B，3--C
    private static int loop = 10;//输出多少轮 ABC
    private static ReentrantLock lock = new ReentrantLock();
    private static CountDownLatch countDown = new CountDownLatch(10);
    private static Condition conditionA = lock.newCondition();
    private static Condition conditionB = lock.newCondition();
    private static Condition conditionC = lock.newCondition();
    public static void main(String[] args) {
        //A线程
        Thread threadA = new Thread(){
            @Override
            public void run(){
                for(int i = 1; i <= loop;i++){
                    lock.lock();
                    if(flag != 1) {
                        try {
                            conditionA.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                        System.out.println(Thread.currentThread().getName() + i + " : A");
                        flag = 2;
                        conditionB.signal();
                        lock.unlock();


                }
            }
        };
        threadA.setName("A线程打印");

        //B线程
        Thread threadB = new Thread(){
            @Override
            public void run(){
                for(int i = 1; i <= loop; i++){
                    lock.lock();
                    if(flag != 2) {
                        try {
                            conditionB.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                        System.out.println(Thread.currentThread().getName() + i + " : B");
                        flag = 3;
                        conditionC.signal();
                        lock.unlock();
                }
            }
        };
        threadB.setName("B线程打印");

        //C线程
        Thread threadC = new Thread(){
            @Override
            public void run(){
                for(int i = 1; i <= loop; i++){
                    lock.lock();
                    if(flag != 3) {
                        try {
                            conditionC.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                        System.out.println(Thread.currentThread().getName() + i + " : C");
                        flag = 1;
                        conditionA.signal();
                        countDown.countDown();
                        lock.unlock();


                }
            }
        };
        threadC.setName("C线程打印");

        //开始打印
        threadA.start();
        threadB.start();
        threadC.start();
        try {
            countDown.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("打印完毕！");
    }

}
