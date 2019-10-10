package cn.itcast.day08.demo03Socket;

import java.io.*;
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

        //为了提高上传的个数，需要使用多线程，每创建一个socket对象，就使用一个线程接收
        while(true){
            //接收来自客户端的对话
            Socket server = ss.accept();
            //使用匿名内部类或者Lambda表达式
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //获得输入流，并且加上缓冲
                        BufferedInputStream bis = new BufferedInputStream(server.getInputStream());
                        //获得输出流，输出到服务器的文件夹内

                        //数据接收并写入服务器上的文件
                        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(
                                "day07-code\\upload\\"+System.currentTimeMillis()+" copy.jpg"));
                        byte[] b = new byte[8*1024];
                        int len = 0;
                        while((len=bis.read(b))!=-1){
                            bos.write(b,0,len);
                        }

                        //告诉客户端文件上传完毕
                        System.out.println("back...");
                        OutputStream os = server.getOutputStream();
                        os.write("上传成功！".getBytes());

                        os.close();

                        //关闭资源
                        bos.close();
                        bis.close();
                        server.close();
                        System.out.println("文件已上传！");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }







    }
}
