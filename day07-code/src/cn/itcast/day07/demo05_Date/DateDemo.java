package cn.itcast.day07.demo05_Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: xie
 * @create: 2019-09-14 12:08
 **/
public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();

        DateFormat df = new SimpleDateFormat("yy-MM-dd HH:mm:ss");

        String str = df.format(date);
        System.out.println(str);
        System.out.println("转化为日期格式："+df.parse(str));
    }
}
