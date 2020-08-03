package cn.xie.base01.demo10_ThreadPool.demo;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * @author: xie
 * @create: 2020-06-11 17:11
 **/
public class MyRunable implements Runnable {

    private String command;

    public MyRunable(String s){
        this.command = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"Start.Time="+new Date());
        processCommand();
        System.out.println(Thread.currentThread().getName()+"End.Time="+new Date());
    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "MyRunable{" +
                "command='" + command + '\'' +
                '}';
    }
}
