package cn.itcast.day08.demo01File;

import java.io.File;
import java.io.IOException;

/**
 * @author: xie
 * @create: 2019-10-04 14:22
 **/
public class Demo01File {
    public static void main(String[] args) {
        //文件的创建
        File f1 = new File("day07-code\\resources\\a.txt");
        System.out.println("是否存在："+ f1.exists());
        try {
            f1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("是否存在："+ f1.exists());

        //目录的创建
        File f2 = new File("day07-code\\resources\\newDir");
        System.out.println("是否存在目录："+ f2.exists());
        f2.mkdir();
        System.out.println("是否存在目录："+ f2.exists());

        //创建多级目录
        File f3 = new File("day07-code\\resources\\newDira\\newDirb");
        System.out.println("是否存在多级目录："+ f3.exists());
        f3.mkdirs();
        System.out.println("是否存在多级目录："+ f3.exists());

    }

}
