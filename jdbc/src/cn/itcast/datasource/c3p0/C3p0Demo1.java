package cn.itcast.datasource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author: xie
 * @create: 2019-10-22 19:31
 **/
public class C3p0Demo1 {
    public static void main(String[] args) throws SQLException {
        //1.创建数据库连接池对象
        DataSource ds = new ComboPooledDataSource();
        //获取连接池对象
        Connection conn = ds.getConnection();
        System.out.println(conn);
    }
}
