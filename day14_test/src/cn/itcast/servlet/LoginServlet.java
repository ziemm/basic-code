package cn.itcast.servlet;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置来自浏览器请求的数据的编码方式
        request.setCharacterEncoding("utf-8");
        //获取请求的参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //封装User对象
        User loginUser = new User();
        loginUser.setUsername(username);
        loginUser.setPasswd(password);
        //调用userDao层的login方法
        UserDao dao = new UserDao();
        User user = dao.login(loginUser);
     /*   //封装user对象的第二种方法（目的是为了简化从前端获取请求参数过多，使得代码冗余）
        //1.1获取所有请求参数
        User loginUser = new User();
        Map<String, String[]> map = request.getParameterMap();
        try {
            //1.2封装对象
            BeanUtils.populate(loginUser,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
*/
        //逻辑判断
        if(user==null){
            //未查到user登录失败
            request.getRequestDispatcher("/failServlet").forward(request,response);
        }else{
            //登录成功
            //存储登录数据
            request.setAttribute("user",user);
            request.getRequestDispatcher("/successServlet").forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
