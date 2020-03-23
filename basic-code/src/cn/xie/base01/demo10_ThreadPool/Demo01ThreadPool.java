package cn.xie.base01.demo10_ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Executors:线程池工厂类，用来生产线程池
 * @author: xie
 * @create: 2019-10-03 21:45
 **/
public class Demo01ThreadPool {
    public static void main(String[] args) {
        //1.生产一个线程池， 用ExecutorService 接收
        ExecutorService es = Executors.newFixedThreadPool(3);
        //将线程任务提交到线程池中进行执行,观察线程池中每个线程的使用
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());

        //不推荐使用关闭线程池
        es.shutdown();
    }



}
