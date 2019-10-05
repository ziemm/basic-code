package cn.itcast.day08.demo02IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author: xie
 * @create: 2019-10-05 14:52
 **/
public class DemoFOS {
    public static void main(String[] args) throws IOException {
        //覆盖写构造方法
        FileOutputStream fos = new FileOutputStream("day07-code\\resources\\fos.txt");

        //追加写构造方法
       // FileOutputStream fos = new FileOutputStream("a.txt",true);

        //1.直接整型写字节文件
        /*fos.write(97);
        fos.write(98);
        fos.write(99);*/

        //2.以byte[] 数组写
        byte[] b = "abcde".getBytes();
        fos.write(b);

       /* byte[] b = "abcde".getBytes();
        fos.write(b,2,2); //指定偏移量和长度*/


        //关闭资源
        fos.close();
    }
}
