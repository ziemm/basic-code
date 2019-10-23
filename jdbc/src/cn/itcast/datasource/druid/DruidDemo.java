package cn.itcast.datasource.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author: xie
 * @create: 2019-10-22 19:50
 **/
public class DruidDemo {
    public static void main(String[] args) throws Exception {
        //1.导入jar包
        //2.定义配置文件
        //3.加载配置文件
        Properties pro = new Properties(); //利用properties对象，通过使用类加载器获取properties文件加载到内存，并直接转化为字节流
        InputStream  is = DruidDemo.class.getClassLoader().getResourceAsStream("druid.properties");

        pro.load(is);
        //4.获取连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
        //5.获取连接对象
        Connection conn = ds.getConnection();
        System.out.println(conn);

    }
}
