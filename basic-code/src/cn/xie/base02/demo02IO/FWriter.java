package cn.xie.base02.demo02IO;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author: xie
 * @create: 2019-10-05 15:43
 **/
public class FWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw1 = new FileWriter("base01-code\\resources\\fw.txt");

        //jdk1.7 后的新写法
        try (FileWriter fw=fw1){
            fw.write(97);
            fw.write("s");
            fw.write('d');
            fw.write(30002);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //fw.flush();
            fw1.close();
        }


    }
}
