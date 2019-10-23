package cn.itcast.datasource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author: xie
 * @create: 2019-10-22 19:36
 **/
public class C3p0Demo2 {
    public static void main(String[] args) throws SQLException {
        //获取连接池（DataSource） 不加参数使用默认的，加参数使用有名字的
        //DataSource ds = new ComboPooledDataSource();
        DataSource ds = new ComboPooledDataSource("otherc3p0");
        //验证最大连接数量
        for (int i = 1; i < 8; i++) {
            Connection conn = ds.getConnection();
            System.out.println(i+":"+conn);

        }
    }
}
