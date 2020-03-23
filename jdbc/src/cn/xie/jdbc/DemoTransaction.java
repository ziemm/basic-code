package cn.xie.jdbc;

import cn.xie.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 事务管理初步使用
 *
 * @author: xie
 * @create: 2019-10-22 17:04
 **/
public class DemoTransaction {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;


        try {
            conn = JDBCUtils.getConnection();

            //开启事务
            conn.setAutoCommit(false);
            //定义sql语句
            String sql1 = "update emp set sal= sal-? where empno= ?";
            String sql2 = "update emp set sal = sal+? where empno= ?";
            //获取执行sql语句的对象
            pstmt1 = conn.prepareStatement(sql1);
            pstmt2 = conn.prepareStatement(sql2);
            //设置参数
            pstmt1.setObject(1,1);
            pstmt1.setObject(2,1);

            pstmt2.setObject(1,1);
            pstmt2.setObject(2,2);

            pstmt1.executeUpdate();
            pstmt2.executeUpdate();

            //提交事务
            conn.commit();

        } catch (SQLException e) {
            //事务回滚
            try {
                if(conn!=null){
                    conn.rollback();;
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            e.printStackTrace();
        } finally {
            JDBCUtils.Close(pstmt1,conn);
            JDBCUtils.Close(pstmt2,null);
        }
    }
}
