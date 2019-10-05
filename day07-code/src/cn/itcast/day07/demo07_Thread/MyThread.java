package cn.itcast.day07.demo07_Thread;

/**
 * @author: xie
 * @create: 2019-10-03 14:31
 **/
public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+i);
        }
    }
}
