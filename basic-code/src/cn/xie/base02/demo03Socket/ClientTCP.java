package cn.xie.base02.demo03Socket;



import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author: xie
 * @create: 2019-10-07 11:29
 **/
public class ClientTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端 发送数据");
        //创建 Socket（ip,port） 确定连接到哪里
        Socket client = new Socket("localhost",6666);
        //获取流对象.输出流
        OutputStream os = client.getOutputStream();
        //写出数据
        os.write("你好吗?tcp,我来了".getBytes());

        //接收数据
        InputStream in = client.getInputStream();
        byte[] b = new byte[1024];
        int len = in.read(b);

        System.out.println(new String(b,0,len));

        in.close();
        os.close();
        client.close();
    }
}
