package cn.itcast.day08.demo03Socket;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: xie
 * @create: 2019-10-08 09:02
 **/
public class FileUpload_Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器启动...");
        ServerSocket ss =new ServerSocket(6666);

        //接收来自客户端的对话
        Socket server = ss.accept();

        //获得输入流，并且加上缓冲
        BufferedInputStream bis = new BufferedInputStream(server.getInputStream());
        //获得输出流，输出到服务器的文件夹内

        //数据接收并写入服务器上的文件
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(
                              "basic-code\\day07-code\\upload\\"+System.currentTimeMillis()+" copy.jpg"));
        byte[] b = new byte[8*1024];
        int len = 0;
        while((len=bis.read(b))!=-1){
            
        }


    }
}
