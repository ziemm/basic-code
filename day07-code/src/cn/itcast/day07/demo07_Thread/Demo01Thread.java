package cn.itcast.day07.demo07_Thread;

/**
 * @author: xie
 * @create: 2019-10-03 14:29
 **/
public class Demo01Thread {
    public static void main(String[] args) {
        MyThread mt = new MyThread("Thread1");
        mt.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("run:"+i);
        }
    }
}
