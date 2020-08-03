package cn.xie.demo3;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author: xie
 * @create: 2020-05-25 14:50
 **/
public class TestTimer {
    static Timer timer = new Timer();

    public static void main(String[] args) {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("---one Task---");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                throw new RuntimeException("error");   //测试代码
            }
        },500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                for (;;){
                    System.out.println("---two Task---");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },1000);
    }
}
