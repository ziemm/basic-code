package cn.xie.base02.demo01File;

import java.io.File;

/**
 * @author: xie
 * @create: 2019-10-04 22:00
 **/
public class Demo02PrintDirs {
    public static void main(String[] args) {
        File dir = new File("C:\\workspace4\\basic-code");
        printDir(dir);
    }

    public static void printDir(File dir){
        File[] files = dir.listFiles();

        for (File file : files) {
            if(file.isFile()){
                System.out.println("文件名："+file.getAbsolutePath());
            }else {
                System.out.println("目录："+file.getAbsolutePath());

                //继续遍历，对下一层的目录进行相同操作
                printDir(file);
            }
        }
    }
}
