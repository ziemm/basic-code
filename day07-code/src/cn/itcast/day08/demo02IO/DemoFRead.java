package cn.itcast.day08.demo02IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author: xie
 * @create: 2019-10-05 15:34
 **/
public class DemoFRead {
    public static void main(String[] args) throws IOException {
        FileReader fr =new FileReader("day07-code\\resources\\a.txt");

        char[] cbuf = new char[2];
        int len;
        while ((len=fr.read(cbuf))!=-1){
            System.out.println(new String(cbuf,0,len));
        }

        fr.close();
    }
}
