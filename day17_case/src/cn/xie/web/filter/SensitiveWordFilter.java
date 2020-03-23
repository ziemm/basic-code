package cn.xie.web.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: xie
 * @create: 2019-11-15 20:30
 **/
@WebFilter("/*")
public class SensitiveWordFilter implements Filter {
    private List<String> list = new ArrayList<String>();//获取敏感词汇集合
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //获取敏感词汇文件
        try {
            //1.获取文件真实路径
            ServletContext servletContext = filterConfig.getServletContext();
            String realPath = servletContext.getRealPath("/WEB-INF/classes/敏感词汇.txt");
            //读取文件
            BufferedReader br = new BufferedReader(new FileReader(realPath));
            //将文件的每一行数据添加到list中
            String line = null;
            while ((line=br.readLine())!=null){
                list.add(line);
            }
            br.close();
            //System.out.println(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //创建代理对象，增强getParameter方法
        ServletRequest proxy_req=(ServletRequest)Proxy.newProxyInstance(servletRequest.getClass().getClassLoader(), servletRequest.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //增强getParameter方法
                //判断是否是该方法
                if(method.getName().equals("getParameter")){
                    //增强返回值
                    //先获取返回值
                    String value = (String)method.invoke(servletRequest, args);
                    if(value!=null){
                        for(String str:list){
                            if(value.contains(str)){
                                value=value.replaceAll(str,"***");
                            }
                        }
                    }
                    return value;
                }
                //判断方法名是否是 getParameterMap

                //判断方法名是否是 getParameterValue

                //若不是这些方法，不增强，直接返回方法的返回值
                return method.invoke(servletRequest,args);
            }
        });

        //2.放行
        filterChain.doFilter(proxy_req, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
