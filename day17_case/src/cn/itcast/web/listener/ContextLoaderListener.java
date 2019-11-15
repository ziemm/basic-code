package cn.itcast.web.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author: xie
 * @create: 2019-11-15 22:18
 **/
public class ContextLoaderListener implements ServletContextListener {
    /**
     ** 监听ServletContext对象创建的。ServletContext对象服务器启动后自动创建。
     *      *
     *      * 在服务器启动后自动调用
     * @param servletContextEvent
     */
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        //加载资源文件
        //1.获取ServletContext对象
        ServletContext servletContext = servletContextEvent.getServletContext();
        //2.加载资源文件
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");
        System.out.println("contextConfigLocation:"+contextConfigLocation);
        //获取真实路径
        String realPath = servletContext.getRealPath(contextConfigLocation);

        //加载进内存
        try {
            FileInputStream fis =new FileInputStream(realPath);
            System.out.println(fis+"文件已经被读取到内存");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("ServletContext对象被创建了。。。");

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext对象被销毁了。。。");
    }
}
