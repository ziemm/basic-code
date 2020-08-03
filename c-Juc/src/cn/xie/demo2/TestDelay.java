package cn.xie.demo2;

import java.util.Random;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @author: xie
 * @create: 2020-05-20 10:26
 **/
public class TestDelay {

    static class DelayedEle implements Delayed{
        private  final long delayTime;
        private  final long expire;
        private String taskName;

        public DelayedEle(long delay,String taskName){
            delayTime=delay;
            this.taskName=taskName;
            expire=System.currentTimeMillis()+delay;
        }



        /*剩余时间=到期时间-当前时间*/
        @Override
        public long getDelay(TimeUnit unit) {
            return unit.convert(this.expire-System.currentTimeMillis(),TimeUnit.MILLISECONDS);
        }

        @Override
        public int compareTo(Delayed o) {
            return (int)(this.getDelay(TimeUnit.MILLISECONDS)-o.getDelay(TimeUnit.MILLISECONDS));
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("DelayedEle{");
            sb.append("delay=").append(delayTime);
            sb.append(",expire=").append(expire);
            sb.append(", taskName='").append(taskName).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        DelayQueue<DelayedEle> delayQueue = new DelayQueue<>();

        final Random random = new Random();
        for (int i = 0; i < 10; i++) {
            final DelayedEle element = new DelayedEle(random.nextInt(500), "task" + i);
            delayQueue.offer(element);
        }

        DelayedEle ele =null;

        try {
            for(;;){
                while ((ele=delayQueue.take())!=null){
                    System.out.println(ele.toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
