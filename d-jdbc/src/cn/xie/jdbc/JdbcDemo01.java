package cn.xie.jdbc;

import cn.xie.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author: xie
 * @create: 2019-10-21 15:47
 **/
public class JdbcDemo01 {
    public static void main(String[] args) throws Exception {
        //导入jar包
//        //注册驱动
//        Class.forName("oracle.jdbc.driver.OracleDriver");
//        //得到Connection连接对象
//        Connection connection = DriverManager.getConnection(
//                "jdbc:oracle:thin:@127.0.0.1:1521:base","xielin","xielin");
        Connection connection = JDBCUtils.getConnection();
        //创建执行语句
        String sql = "select * from emp where empno = ?";
        //得到预编译的Statement对象
        PreparedStatement pstm = connection.prepareStatement(sql);
        //给参数赋值
        pstm.setObject(1,7369);
        //获得查询的结果集
        ResultSet rs = pstm.executeQuery();

        //输出结果
        while(rs.next()){
            System.out.println(rs.getString("ename"));
        }

        //释放资源
        rs.close();
        pstm.close();
        connection.close();
    }
}
