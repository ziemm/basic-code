package cn.xie.base02.demo03Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: xie
 * @create: 2019-10-07 11:25
 **/
public class ServerTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器启动，等待连接...");
        ServerSocket ss = new ServerSocket(6666);
        //接收连接 accept() 返回socket对象
        Socket server = ss.accept();
        //通过socket获取输入流
        InputStream is = server.getInputStream();
        //一次性读取数据
        byte[] b = new byte[1024];
        //记录消息长度
        int len = is.read(b);
        //解析数组,打印字符串信息
        String msg = new String(b,0,len);
        System.out.println(msg);

        //回写数据
        //通过socket回写输出流
        OutputStream out = server.getOutputStream();
        out.write("我很好，谢谢你".getBytes());

        out.close();
        is.close();
        server.close();

    }
}
