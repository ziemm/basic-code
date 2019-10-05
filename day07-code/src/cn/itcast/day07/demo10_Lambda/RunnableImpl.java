package cn.itcast.day07.demo10_Lambda;

/**
 * @author: xie
 * @create: 2019-10-03 22:25
 **/
public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始执行！");
    }
}
