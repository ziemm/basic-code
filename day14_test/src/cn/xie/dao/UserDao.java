package cn.xie.dao;

import cn.xie.domain.User;
import cn.xie.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 操作数据库User表的类
 * @author: xie
 * @create: 2019-11-01 18:25
 **/
public class UserDao {
    //声明对JdbcTemplate 对象的共用
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    /**
    *登录方法(使用了Template的封装方法的方式)
    */
    public User login(User loginUser){
        User user = null;
        try {
            String sql = "select * from t_user where username = ?and passwd = ?";
            //调用 Query方法
            user = template.queryForObject(
                    sql, new BeanPropertyRowMapper<User>(User.class), loginUser.getUsername(), loginUser.getPasswd());
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     *登录方法(不使用Template的方式)
     */
    public User login1(User loginUser){
        User user = new User();
        try {
            String sql = "select * from t_user where username = ?and passwd = ?";

            Connection conn = JDBCUtils.getConnection();

            //使用下面的执行查询语句并使用占位符填补参数
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setObject(1,loginUser.getUsername());
            pstm.setObject(2,loginUser.getPasswd());

            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPasswd(rs.getString("passwd"));

            }

            return user;
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

