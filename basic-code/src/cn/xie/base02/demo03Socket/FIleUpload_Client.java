package cn.xie.base02.demo03Socket;

import java.io.*;
import java.net.Socket;

/**
 * @author: xie
 * @create: 2019-10-08 11:20
 **/
public class FIleUpload_Client {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端启动中...");
        //获得输入流，读取本地文件
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream("base01-code\\img\\test.jpg"));

        //创建socket
        Socket client = new Socket("localhost", 6666);

        //创建输出流
        BufferedOutputStream bos = new BufferedOutputStream(client.getOutputStream());
        //写出数据
        byte[] b = new byte[8 * 1024];
        int len;
        while ((len = bis.read(b)) != -1) {
            bos.write(b, 0, len);
            bos.flush();
        }

        //关闭输出流，并告知服务器写出完毕
        client.shutdownOutput();
        System.out.println("文件发送完毕！");

        //解析写回信息
        InputStream is = client.getInputStream();
        byte[] back = new byte[20];
        is.read(back);
        System.out.println(new String(back));
        is.close();

        //释放资源
        bos.close();
        client.close();
        bis.close();
        System.out.println("文件已保存！");
    }
}
