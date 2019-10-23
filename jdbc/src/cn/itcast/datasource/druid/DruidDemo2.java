package cn.itcast.datasource.druid;

import cn.itcast.domain.Person;
import cn.itcast.utils.JDBCUtilsDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: xie
 * @create: 2019-10-22 20:19
 **/
public class DruidDemo2 {
    public static void main(String[] args)  {
        Statement st = null;
        Connection conn = null;
        ResultSet rs = null;
        try {
            //获取连接
            conn = JDBCUtilsDataSource.getConnection();

            //创建执行语句
            String sql = "select * from person";
            //获得执行语句的对象
            st = conn.createStatement();
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
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            JDBCUtilsDataSource.Close(st,conn,rs);
        }

    }
}
