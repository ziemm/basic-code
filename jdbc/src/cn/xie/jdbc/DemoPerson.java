package cn.xie.jdbc;

import cn.xie.domain.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: xie
 * @create: 2019-10-21 19:28
 **/
public class DemoPerson {
    public static void main(String[] args) {
        {

            Statement st = null;
            Connection connection = null;
            ResultSet rs = null;
            try {
                //注册驱动
                Class.forName("oracle.jdbc.driver.OracleDriver");
                //得到Connection连接对象
                connection = DriverManager.getConnection(
                        "jdbc:oracle:thin:@127.0.0.1:1521:base","xielin","xielin");
                //创建执行语句
                String sql = "select * from person";
                //获得执行语句的对象
                st = connection.createStatement();
                //执行dql语句
                rs = st.executeQuery(sql);
                //接收数据
                List<Person> list= new ArrayList<Person>();
                Person person = new Person();
                while(rs.next()){
                    person.setPid(rs.getInt("pid"));
                    person.setName(rs.getString("pname"));
                    list.add(person);
                    System.out.println(person);
                }

                System.out.println("读取完毕！");

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                //释放资源
                if(rs!=null){
                    try {rs.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if(st!=null){
                    try {
                        st.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if(st!=null){
                    try {
                        st.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if(connection!=null){
                    try {
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }


        }
    }
}
