package cn.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet("/requestDemo6")
public class RequestDemo6 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决获取的请求参数是乱码的问题
        request.setCharacterEncoding("utf-8");
        //演示通用请求参数
        String username = request.getParameter("username");
        System.out.println(username);

        String[] hobbies = request.getParameterValues("hobby");
        for (String hobby : hobbies) {
            System.out.println(hobby);
        }
        System.out.println("1------------");
        Enumeration<String> parameterNames = request.getParameterNames();
        while(parameterNames.hasMoreElements()){
            String name = parameterNames.nextElement();
            System.out.println(name);
            System.out.println(request.getParameter(name));
        }
        System.out.println("2-----------");
        Map<String, String[]> parameterMap = request.getParameterMap();
        //遍历Map
        Set<String> ketSet =parameterMap.keySet();
        for (String name : ketSet) {
            String[] values = parameterMap.get(name);
            System.out.println(values);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
