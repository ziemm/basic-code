package cn.xie;

import javax.lang.model.element.VariableElement;

/**
 * @author: xie
 * @create: 2020-05-12 15:55
 **/
public class TestThreadLocal {
    //
    //public static ThreadLocal<String> threadLocal = new ThreadLocal<String>();
    static ThreadLocal<String> threadLocal = new InheritableThreadLocal<>();
    public static void main(String[] args) {
        threadLocal.set("hello world");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread:"+threadLocal.get());
            }
        });
        thread.start();

        System.out.println("main:"+threadLocal.get());
    }
}
