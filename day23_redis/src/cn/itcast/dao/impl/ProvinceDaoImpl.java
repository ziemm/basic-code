package cn.itcast.dao.impl;

import cn.itcast.dao.ProvinceDao;
import cn.itcast.domain.Province;
import cn.itcast.utils.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author: xie
 * @create: 2019-11-26 19:25
 **/
public class ProvinceDaoImpl implements ProvinceDao {
    //声明成员变量 jdbctemplement
    private JdbcTemplate template =new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public List<Province> findAll() {
        //定义sql
        String sql = "select * from province";
        List<Province> list = template.query(sql, new BeanPropertyRowMapper<Province>(Province.class));
        return list;
    }
}
