package cn.itcast.day07.demo10_WaitAndNotify;

/**
 * 包子铺作为生产者
 * @author: xie
 * @create: 2019-10-03 20:36
 **/
public class BaoziPu extends Thread{
    private  Baozi bz;
    //生产者生产包子：
    public BaoziPu(Baozi bz){
        this.bz = bz;
    }

    @Override
    public void run() {
        while(true){
            synchronized (bz){
                if(bz.flag==true){  //如果有包子，则包子进入等待状态
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //没有包子则生产包子
                bz.pi="薄皮";
                bz.xian="猪肉大葱";
                System.out.println("包子铺生产包子("+bz.pi+bz.xian+")中...");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // 生产好包子后状态应改为：有
                bz.flag=true;
                //并唤醒（通知）吃货吃包子
                bz.notify();
                System.out.println("包子铺生产好了包子:"+bz.pi+bz.xian+"吃货可以吃了！");
            }
        }
    }
}
