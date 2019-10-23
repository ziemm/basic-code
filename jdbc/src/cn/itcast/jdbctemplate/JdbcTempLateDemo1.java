package cn.itcast.jdbctemplate;

import cn.itcast.utils.JDBCUtilsDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 简化数据的操作
 * @author: xie
 * @create: 2019-10-22 20:36
 **/
public class JdbcTempLateDemo1 {
    public static void main(String[] args) {
        //导入jar包
        //创建JdbcTempLate对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtilsDataSource.getDataSource());
        String sql = "update emp set sal = 8000 where empno = ?";
        int update = template.update(sql, 7369);
        System.out.println(update);

    }
}
