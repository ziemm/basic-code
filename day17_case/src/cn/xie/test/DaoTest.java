package cn.xie.test;

import cn.xie.dao.UserDao;
import cn.xie.dao.impl.UserDaoImpl;
import cn.xie.domain.User;
import cn.xie.utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author: xie
 * @create: 2019-11-08 17:17
 **/
public class DaoTest {
    @Test
    public void test1(){
        try {
            Connection conn = JDBCUtils.getConnection();
            System.out.println(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test2(){
        UserDaoImpl udi = new UserDaoImpl();
        User user = new User();
        user.setName("张三");
        user.setGender("男");
        user.setAge(18);
        user.setAddress("北京市上园村");
        user.setQq("547829555");
        user.setEmail("aa@aa.com");
        udi.add(user);
    }
    @Test
    public void test3(){
        UserDao dao = new UserDaoImpl();
        User zhangsan = dao.findUserByUsernameAndPassword("zhangsan", "123456");
        System.out.println(zhangsan);
    }

}
