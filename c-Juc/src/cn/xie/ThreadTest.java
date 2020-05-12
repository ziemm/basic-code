package cn.xie;

/**
 * @author: xie
 * @create: 2020-05-10 17:38
 **/
public class ThreadTest {
    public static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("I'm a child thread!");
        }
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
