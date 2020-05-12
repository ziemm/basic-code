package cn.xie;

/**
 * @author: xie
 * @create: 2020-05-12 07:58
 **/
public class WaitAndNotifyInterupt {
    static Object obj = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (obj) {
                    System.out.println("---begin---");
                        obj.wait();
                    }
                    System.out.println("---end---");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        threadA.start();
        Thread.sleep(1000);

        System.out.println("begin interrupt----");
        threadA.interrupt();
        System.out.println("---end interrupt---");
    }
}
