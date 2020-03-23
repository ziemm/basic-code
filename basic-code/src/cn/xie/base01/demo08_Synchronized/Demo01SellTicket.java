package cn.xie.base01.demo08_Synchronized;

/**
 * @author: xie
 * @create: 2019-10-03 16:39
 **/
public class Demo01SellTicket {
    public static void main(String[] args) {
        //创建线程任务对象

        Tickets ticket = new Tickets();

        Thread t1 = new Thread(ticket,"windows1");
        Thread t2 = new Thread(ticket,"windows2");
        Thread t3 = new Thread(ticket,"windows3");

        t1.start();
        t2.start();
        t3.start();
    }
}
