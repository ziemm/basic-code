package cn.itcast.day07.demo07_Thread;

/**
 * 创建线程的第二种方法
 *
 * @author: xie
 * @create: 2019-10-03 15:08
 **/
public class Demo01Runable {

    public static void main(String[] args) {
        //1.创建Runnble实现了并重写run方法
        //2.创建实现类对象
        MyRunable myRunable= new MyRunable();
        //创建Thread类对象，并将Runable对象作为参数传入
        Thread t = new Thread(myRunable,"bun");
        t.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread()+""+i);
        }
    }


}

class MyRunable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread()+""+i);
        }
    }
}
