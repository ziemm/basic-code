package cn.xie;

/**
 * @author: xie
 * @create: 2020-05-12 10:13
 **/
public class SleepInteruptTest {
    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("threadOne begin sleep for 2000 seconds");
                    Thread.sleep(2000000);
                    System.out.println("ThreadOne awaking");
                } catch (InterruptedException e) {
                    System.out.println("ThreadOne is interrupted while sleeping");
                    return;
                }
                System.out.println("threadOne-leaving normally");
            }
        });

        threadOne.start();
        Thread.sleep(1000);

        threadOne.interrupt();

        threadOne.join();
        System.out.println("main is over!");
    }
}
