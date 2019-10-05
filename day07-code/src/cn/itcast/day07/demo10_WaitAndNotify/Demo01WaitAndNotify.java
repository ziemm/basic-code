package cn.itcast.day07.demo10_WaitAndNotify;

/**
 * 线程之间通信：
 * （1）顾客与老板必须在同步代码块中；
 * （2）同步使用的锁对象必须保证唯一；
 * （3）只有锁对象才能调用wait与nofify方法
 * @author: xie
 * @create: 2019-10-03 19:21
 **/
public class Demo01WaitAndNotify {
    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object obj = new Object();
        //消费者
        new Thread(){
            @Override
            public void run() {
                while(true){
                    synchronized (obj){
                        System.out.println("告知老板包子种类和数量");
                        try {
                            obj.wait(); //进入 WAITING状态
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                    //唤醒之后，继续执行wait之后的代码
                    System.out.println("继续执行wait之后的代码:谢谢老板，开吃！");
                    System.out.println("-------------------------------------");

                }
            }
        }.start();

        //生产者
        new Thread(){
            @Override
            public void run() {
                while(true){
                    try {
                        Thread.sleep(3000);  //生产者做包子时间
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (obj){
                        System.out.println("包子已经做好了，告知顾客可以吃了！");
                        obj.notify();  //唤醒消费者等待线程
                    }

                }
            }

        }.start();
    }
}
