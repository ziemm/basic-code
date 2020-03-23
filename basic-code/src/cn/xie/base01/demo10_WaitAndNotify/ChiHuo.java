package cn.xie.base01.demo10_WaitAndNotify;

/**
 * @author: xie
 * @create: 2019-10-03 20:53
 **/
public class ChiHuo extends Thread {
    private Baozi bz;
    public ChiHuo(Baozi bz){
        this.bz = bz;
    }
    @Override
    public void run() {
        while(true){  //吃包子
            synchronized (bz){
                if(bz.flag==false){  //如果没有包子
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //被唤醒之后执行的代码，吃包子
                System.out.println("吃货正在吃包子（"+bz.pi+bz.xian+"）中...");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //吃完包子要修改包子的状态为false
                bz.flag=false;
                //并唤醒包子铺线程，生产包子
                bz.notify();
                System.out.println("吃货已经吃完了包子："+bz.pi+bz.xian);
                System.out.println("需要包子铺做包子！");
                System.out.println("-----------------------");
            }
        }
    }
}
