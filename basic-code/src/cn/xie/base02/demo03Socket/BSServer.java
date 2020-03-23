package cn.xie.base02.demo03Socket;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * //服务器的请求路径是以整个工程为开头：端口号/项目名/文件路径
 * @author: xie
 * @create: 2019-10-10 15:39
 **/
public class BSServer {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器开启中...");
        ServerSocket ss = new ServerSocket(8080);
        while(true){
            Socket socket = ss.accept();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream is = socket.getInputStream();

        /*byte[] b = new byte[1024];
        int len =0;
        while((len=is.read(b))!=-1){
            System.out.println(new String(b,0,len));
        }
        System.out.println("浏览器请求完毕！");*/

//        GET /base01-code/web/index.html HTTP/1.1
//        Host: localhost:8080
//        Connection: keep-alive
//        Cache-Control: max-age=0
//        Upgrade-Insecure-Requests: 1
//        User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/76.0.3809.100 Safari/537.36
//        Sec-Fetch-Mode: navigate
//        Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3
//        Sec-Fetch-Site: cross-site
//        Accept-Encoding: gzip, deflate, br
//        Accept-Language: zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7
//        Cookie: sdmenu_my_menu=000100

                        //利用转换流读取浏览器的请求消息，并使用BufferedReader接收
                        BufferedReader br= new BufferedReader(new InputStreamReader(is));//将利用socket获取的字节转换成字符流，并装入到缓冲流中进行操作

                        //根据请求的整体信息中获取到请求路径   GET /base01-code/web/index.html HTTP/1.1
                        String request = br.readLine();   //GET /base01-code/web/index.html HTTP/1.1
                        //取出请求资源的路径
                        String[] strArr=request.split(" "); //使用“空格”切割字符串

                        String path = strArr[1].substring(1);

                        System.out.println("path:"+path);
                        //读取客户端请求的资源文件
                        FileInputStream fis = new FileInputStream(path);
                        //创建输出流：输出回浏览器
                        OutputStream out = socket.getOutputStream();

                        // 写入HTTP协议响应头,固定写法
                        out.write("HTTP/1.1 200 OK\r\n".getBytes());
                        out.write("Content-Type:text/html\r\n".getBytes());
                        // 必须要写入空行,否则浏览器不解析
                        out.write("\r\n".getBytes());


                        byte[] b = new byte[1024];
                        int len =0;
                        while((len=fis.read(b))!=-1){  //读取找到的html网页文件
                            out.write(b,0,len);
                        }


                        fis.close();
                        socket.close();
                    }catch ( IOException e){
                        e.printStackTrace();
                    }
                }
            }).start();

        }


        //ss.close();

    }
}
