package com.xie.classloading;

/**
 * 非法向前引用测试
 * @author: xie
 * @create: 2020-03-15 20:38
 **/
public class Test {
    /*static {
        i = 0;//但是静态语句块中可以给后面的类变量赋值
       // System.out.println(i);//编译器显示 非法向前引用
    }
    static int i = 1;*/

    static class DeadLoopClass {//多线程时 类的<clinit>()方法执行演示：只有一个线程会执行该方法，其他线程阻塞。
        static {
            if(true){
                System.out.println(Thread.currentThread()+"init DeepLoopClass");
                while (true){}
            }
        }
    }

    public static void main(String[] args) {
        Runnable script = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread()+"start");
                DeadLoopClass dlc = new DeadLoopClass();
                System.out.println(Thread.currentThread()+"run over");
            }
        };

        Thread thread1 = new Thread(script);

        Thread thread2 = new Thread(script);
        thread1.start();
        thread2.start();



    }

}
