package cn.xie.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //强制转换
        HttpServletRequest request = (HttpServletRequest) req;

        //获取资源请求路径
        String uri = request.getRequestURI();
        //放行包含登录的资源,包括css.js/图片/验证码等资源
        if(uri.contains("/login.jsp") || uri.contains("/loginServlet") || uri.contains("/css/") || uri.contains("/js/")
                || uri.contains("/fonts/") || uri.contains("/checkCodeServlet") ){
            //包含就放行
            chain.doFilter(req,resp);
        }else{
            //不包含，需要验证用户登录
            //即验证session中是否有user
            Object user = request.getSession().getAttribute("user");
            if (user!=null){
                //登陆了，放行
                chain.doFilter(req,resp);
            }else{
                //没有登录。跳转登录页面
                request.setAttribute("login_msg","您尚未登录，请登陆！");
                request.getRequestDispatcher("/login.jsp").forward(request,resp);
            }
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
