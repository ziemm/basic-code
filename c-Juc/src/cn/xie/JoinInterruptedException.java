package cn.xie;

/**
 * @author: xie
 * @create: 2020-05-12 08:39
 **/
public class JoinInterruptedException {
    public static void main(String[] args) {
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("threadOne begin run。。。");

                for (;;){}//制造死循环
            }
        });

        final Thread mainThread = Thread.currentThread();

        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //two中断调用threadOne线程的mainThread，
                mainThread.interrupt();
            }
        });

        threadOne.start();

        threadTwo.start();

        try {
            threadOne.join();//使threadA加入到当前线程，并等待其结束
        } catch (InterruptedException e) {
            System.out.println("mainThread:"+e);
        }
    }
}
