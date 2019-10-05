package cn.itcast.day07.demo07_Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author: xie
 * @create: 2019-10-02 20:31
 **/
public class Demo05Throws {
    public static void main(String[] args){
        try {
            read(".txt");
        } catch (IOException e) {
            //e.getMessage();
            //e.toString();
            e.printStackTrace();
           // e.printStackTrace();
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
        System.out.println("后续代码！");
    }

    public static void read(String path) throws IOException {
        if(!path.equals("a.txt")){
            throw new FileNotFoundException("文件名不对");
        }
        if(!path.equals("b.txt")){
            throw new IOException();
        }
    };
}
