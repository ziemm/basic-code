package cn.itcast.day07.demo08_Synchronized_method;



/**
 * @author: xie
 * @create: 2019-10-03 16:40
 **/
public class Tickets implements Runnable {
    private int ticket = 100;
    @Override
    public void run() {
        while(true){
            //将可能出现线程安全的代码放到一个方法中用synchronized修饰
            sellTicket();
        }
    }

    /**
    * @Description:  同步方法的锁对象就是就是该实现类对象
     *                   注：静态方法的锁对象是本类的class属性-->class对象(反射)
    * @Param: []
    * @return: void
    */
    public synchronized void sellTicket(){
        {
            if(ticket>0){
                //出票
                //模拟出票时间
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在卖票"+ticket--);
            }
        }
    }
}
