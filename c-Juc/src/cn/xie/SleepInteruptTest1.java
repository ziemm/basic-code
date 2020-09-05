package cn.xie;

/**
 * @author: xie
 * @create: 2020-08-11 11:07
 **/
public class SleepInteruptTest1 {
    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                for (;;){

                }
            }
        });

        threadOne.start();

        threadOne.interrupt();

        //获取中断标志
        System.out.println("isInterrupted:"+Thread.currentThread().getName()+threadOne.isInterrupted());
        //获取中断标志并重置
        System.out.println("isInterrupted:"+Thread.currentThread().getName()+threadOne.interrupted());
        //获取中断标志并重置
        System.out.println("isInterrupted:"+Thread.currentThread().getName()+Thread.interrupted());
        //获取中断标志
        System.out.println("isInterrupted:"+Thread.currentThread().getName()+ threadOne.isInterrupted());

        threadOne.join();
        System.out.println("main thread is over");

    }

}
