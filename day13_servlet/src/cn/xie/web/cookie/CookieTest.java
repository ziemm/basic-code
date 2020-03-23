package cn.xie.web.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 记住上一次访问时间
 */
@WebServlet("/cookieTest")
public class CookieTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置响应消息体的数据格式及编码
        response.setContentType("text/html;charset=utf-8");

        //1.获取所有cookie
        Cookie[] cookies = request.getCookies();
        boolean flag = false;//设置标志，没有cookie为lastTime
        //2.遍历cookie数组
        if(cookies!=null&&cookies.length>0){
            for(Cookie cookie:cookies){
                //获取cookie的名称
                String name = cookie.getName();
                //判断cookie的名称是否是lastTime
                if("lastTime".equals(name)){
                    //有Cookie，不是第一次访问
                    flag=true;
                    //重新设置cookie的值
                    Date now = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                    //出现了中文放在cookie中可能会出现中文乱码,使用URL编码解决
                    String str_now = sdf.format(now);
                    //URL编码
                    str_now = URLEncoder.encode(str_now, "utf-8");
                    cookie.setValue(str_now);
                    //设置cookie的存活时间
                    cookie.setMaxAge(60*60*24);
                    //发送到客户端
                    response.addCookie(cookie);

                    //在网页上显示响应数据
                    String value = cookie.getValue();

                    //对value解码
                    value= URLDecoder.decode(value,"utf-8");
                    response.getWriter().write("<h1>欢迎回来，您上次的访问时间是："+value+"</h1>");
                    break;
                }
            }
        }

        if(cookies==null||cookies.length==0||flag==false){//首次登录

            //设置访问lastTime cookie
            Date now = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            String str_now = sdf.format(now);
            Cookie cookie = new Cookie("lastTime",str_now);
            //URL编码
            str_now = URLEncoder.encode(str_now, "utf-8");
            cookie.setValue(str_now);
            //设置cookie的存活时间
            cookie.setMaxAge(60*60*24);
            response.addCookie(cookie);
            response.getWriter().write("<h1>您好，欢迎您首次访问！</h1>");

        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
