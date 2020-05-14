package cn.xie.demo2;

/**
 * @author: xie
 * @create: 2020-05-13 12:11
 **/
public class ReOrderTest {
    public static class ReadThread extends Thread{
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()){
                if(ready){
                    System.out.println(num+num);
                }
                System.out.println("read thread。。。");
            }
        }
    }

    public static class WriteThread extends Thread{
        @Override
        public void run() {
            num= 2;
            ready = true;
            System.out.println("writeThread set over...");
        }
    }

    private static int num = 0;
    private static boolean ready =false;

    public static void main(String[] args) throws InterruptedException {
        ReadThread readThread = new ReadThread();
        readThread.start();

        WriteThread writeThread = new WriteThread();
        writeThread.start();

        Thread.sleep(10);
        readThread.interrupt(); //此处中断的是main线程
        System.out.println("main exit");
    }
}
