package cn.xie.demo3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author: xie
 * @create: 2020-05-25 11:53
 **/
public class TestSimpleDateFormat2 {
    //创建ThreadLocal实例
    static ThreadLocal<DateFormat> safeSdf = new ThreadLocal<DateFormat>(){
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(safeSdf.get().parse("2017-12-13 15:17:27"));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }finally {
                        safeSdf.remove();
                    }
                }
            });
            thread.start();
        }
    }
}
