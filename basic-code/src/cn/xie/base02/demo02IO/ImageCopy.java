package cn.xie.base02.demo02IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author: xie
 * @create: 2019-10-05 15:21
 **/
public class ImageCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("base01-code\\img\\test.jpg");

        FileOutputStream fos = new FileOutputStream("base01-code\\img\\test_copy.jpg");

        byte[] b = new byte[10];
        int len;

        while((len=fis.read(b))!=-1){
            fos.write(b,0,len);
        }

        fos.close();
        fis.close();
    }

}
