package cn.itcast.day07.demo10_ThreadPool;

/**
 * @author: xie
 * @create: 2019-10-03 21:57
 **/
public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始执行！");
    }
}
