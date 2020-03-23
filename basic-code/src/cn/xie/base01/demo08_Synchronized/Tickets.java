package cn.xie.base01.demo08_Synchronized;

/**
 * @author: xie
 * @create: 2019-10-03 16:40
 **/
public class Tickets implements Runnable {
    private int ticket = 100;
    Object lock = new Object();
    @Override
    public void run() {
        while(true){
            synchronized(lock){
                if(ticket>0){
                    //出票
                    //模拟出票时间
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"正在卖票"+ticket--);
                }
            }
        }
    }
}
