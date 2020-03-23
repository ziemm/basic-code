package cn.xie.base02.demo02IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: xie
 * @create: 2019-10-05 15:10
 **/
public class DemoFIS {
    public static void main(String[] args) throws IOException {
        //FileInputStream fis = new FileInputStream("base01-code\\resources\\a.txt");
        InputStreamReader isr = new InputStreamReader(new FileInputStream("base01-code\\resources\\a.txt"));
        int len;//标明读取的长度
        byte[] b = new byte[2];
        while((len=isr.read())!=-1){
            System.out.println((char)len);
        }

        isr.close();
    }
}
