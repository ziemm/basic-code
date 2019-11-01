package cn.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * 获取请求头数据
 */
@WebServlet("/requestDemo2")
public class RequestDemo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         //获取请求头数据
        Enumeration<String> headerNames = request.getHeaderNames();
       /* while(headerNames.hasMoreElements()){
            String rName = headerNames.nextElement();  //获取请求头的名称
            String value= request.getHeader(rName);
            System.out.println(rName+"----"+value);
        }*/

       String value = request.getHeader("cookie");
       System.out.println("cookie"+value);
    }
}
