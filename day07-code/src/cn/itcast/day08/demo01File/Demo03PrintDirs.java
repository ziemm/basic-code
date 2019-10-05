package cn.itcast.day08.demo01File;

import java.io.File;
import java.io.FileFilter;

/**
 * @author: xie
 * @create: 2019-10-05 13:40
 **/
public class Demo03PrintDirs {
    public static void main(String[] args) {
        File dir = new File("C:\\workspace4\\basic-code");
        printDir(dir);
    }

    public static void printDir(File dir) {

        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                /*if (pathname.isDirectory()){
                    return  true;
                }*/
                //上述if代码可继续优化  用  ||
                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java");
            }
        });
        for (File file : files) {
            if(file.isDirectory()){
                printDir(file);
            }else{
                System.out.println(file);
            }
        }
    }

    //使用Lambda表达式
    public static void printDir1(File dir) {

        File[] files = dir.listFiles((file)->{
            return file.isDirectory() || file.getName().toLowerCase().endsWith(".java");
        });
        for (File file : files) {
            if(file.isDirectory()){
                printDir1(file);
            }else{
                System.out.println(file);
            }
        }
    }

}
