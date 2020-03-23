package cn.xie.base02.demo01File;

import java.io.File;

/**
 * 目录遍历
 * @author: xie
 * @create: 2019-10-04 21:15
 **/
public class demo02FileFor {
    public static void main(String[] args) {
        File dir = new File("C:\\workspace4\\basic-code");

        //获取当前目录下的文件及文件夹名称
        String[] names = dir.list();
        for(String name : names){
            System.out.println(name);
        }

        //获取当前目录下的文件及文件夹对象，获得对象后，就可以获得更多信息
        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

    }
}
