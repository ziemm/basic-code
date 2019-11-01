package cn.itcast.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author: xie
 * @create: 2019-11-01 11:40
 **/
public class JDBCUtils {
    private static DataSource ds = null;

    static {
        try {
            //加载配置文件
            Properties pro = new Properties();
            //使用类加载器加载配置文件，获取字节输入流
            InputStream ism = JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            pro.load(ism);

            //初始化数据库连接池对象
            ds = DruidDataSourceFactory.createDataSource(pro);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //获取连接
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    //获取连接池对象
    public static DataSource getDataSource(){
        return  ds;
    }

    public static void Close(Statement stmt, Connection conn) {
       if(stmt!=null){
           try {
               stmt.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }

       if(conn!=null){
           try {
               conn.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
    }

    public static void Close(Statement stmt, Connection conn, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
