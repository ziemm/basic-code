package cn.xie.web.Downloads;


import cn.xie.web.utils.DownLoadUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
/**
 *servletContext的功能
 * 1.获取MIME的功能
 * 2获取文件的真实(服务器)路径
 * 3设置共享域数据
 *
 */
@WebServlet("/downloadServlet")
public class DownloadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*//ServletContext的功能
        ServletContext context = this.getServletContext();
        String filename = "a.jpg";
        String mimeType = context.getMimeType(filename);
        System.out.println(mimeType);

        String path = context.getRealPath("b.txt");
        System.out.println(path);*/

        //文件下载需求
        //1.获取请求参数，文件名称
        String filename = request.getParameter("filename");
        //2.使用字节流加载文件进内存
        //2.1找到文件服务器路径
        ServletContext servletContext = this.getServletContext();
        String realPath = servletContext.getRealPath("/img/" + filename);
        //2.1用字节流关联
        FileInputStream fis=new FileInputStream(realPath);

        //设置response响应头
        //3.1设置响应头类型：content-type
        String mimeType = servletContext.getMimeType(filename);
        response.setHeader("content-type",mimeType);

        //可能会出现文件名中文乱码问题
        //.1获取user-agent请求头
        String agent = request.getHeader("user-agent");
        //.2使用工具类编码文件名
        String fileName = DownLoadUtils.getFileName(agent, filename);


        //3.2设置响应头的打开方式
        response.setHeader("content-disposition","attachment;filename="+fileName);

        //4将输入流数据写出到输出流中
        ServletOutputStream sos = response.getOutputStream();
        byte[] buff = new byte[1024*8];
        int len =0;
        while((len=fis.read(buff))!=-1){
            sos.write(buff,0,len);
        }

        fis.close();


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       this.doPost(request,response);
    }
}
