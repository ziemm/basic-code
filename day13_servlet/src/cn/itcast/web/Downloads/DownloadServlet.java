package cn.itcast.web.Downloads;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
        ServletContext context = this.getServletContext();
        String filename = "a.jpg";
        String mimeType = context.getMimeType(filename);
        System.out.println(mimeType);

        String path = context.getRealPath("b.txt");
        System.out.println(path);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       this.doPost(request,response);
    }
}
