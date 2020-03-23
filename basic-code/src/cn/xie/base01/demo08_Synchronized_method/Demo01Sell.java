package cn.xie.base01.demo08_Synchronized_method;

/**
 * @author: xie
 * @create: 2019-10-03 17:01
 **/
public class Demo01Sell {

        public static void main(String[] args) {
        //创建线程任务对象

        Tickets ticket = new Tickets();

        Thread t1 = new Thread(ticket,"windows11");
        Thread t2 = new Thread(ticket,"windows22");
        Thread t3 = new Thread(ticket,"windows33");
        t1.start();
        t2.start();
        t3.start();
    }

}
