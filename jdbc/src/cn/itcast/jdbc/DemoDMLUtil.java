package cn.itcast.jdbc;

import cn.itcast.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author: xie
 * @create: 2019-10-21 21:06
 **/
public class DemoDMLUtil {
    public static void main(String[] args) {
        Statement st = null;
        Connection connection = null;
        try {
//            //注册驱动
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//            //得到Connection连接对象
//            connection = DriverManager.getConnection(
//                    "jdbc:oracle:thin:@127.0.0.1:1521:base","xielin","xielin");
            connection = JDBCUtils.getConnection();
            //创建执行语句
            String sql = "insert into person(pid,pname) values(s_person.nextval,'孙悟空')";
            //获得执行语句的对象
            st = connection.createStatement();
            //执行ddl语句
            int count = st.executeUpdate(sql);
            //判断是否执行成功
            if(count>0){
                System.out.println("插入成功！");
            }else{
                System.out.println("插入失败！");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.Close(st,connection);
        }
    }
}
