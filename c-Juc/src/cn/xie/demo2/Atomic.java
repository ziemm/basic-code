package cn.xie.demo2;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author: xie
 * @create: 2020-05-14 11:04
 **/
public class Atomic {
    private static AtomicLong atomicLong = new AtomicLong();

    private static Integer[] arraryOne = new Integer[]{0,1,2,3,1,0,3,5,3,22,0};
    private static Integer[] arraryTwo = new Integer[]{0,1,2,0,1,0,3,5,3,22,0};

    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < arraryOne.length; i++) {
                    if(arraryOne[i].intValue()==0){
                        atomicLong.incrementAndGet();
                    }
                }
            }
        });
        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < arraryTwo.length; i++) {
                    if(arraryTwo[i].intValue()==0){
                        atomicLong.incrementAndGet();
                    }
                }
            }
        });

        threadOne.start();
        threadTwo.start();

        threadOne.join();
        threadTwo.join();
        System.out.println("count 0 :0"+atomicLong.get());
    }
}
