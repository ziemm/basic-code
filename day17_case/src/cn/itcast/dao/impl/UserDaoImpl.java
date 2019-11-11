package cn.itcast.dao.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import cn.itcast.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author: xie
 * @create: 2019-11-08 13:57
 **/
public class UserDaoImpl implements UserDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public void add(User user) {
        //定义 sql
        String sql ="insert into c_user values(s_c_user.nextval,?,?,?,?,?,?,null,null)";
        //执行sql
        template.update(sql,user.getName(),user.getGender(),user.getAge(),user.getAddress(),user.getQq(),user.getEmail());

    }
}
