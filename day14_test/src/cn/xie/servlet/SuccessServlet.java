package cn.xie.servlet;

import cn.xie.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/successServlet")
public class SuccessServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取request共享域中的用户信息
        User user = (User) request.getAttribute("user");
        //将用户信息返回给页面
        if(user!=null){
            //设置返回数据的编码
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("登录成功！"+user.getUsername()+",欢迎您！");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
