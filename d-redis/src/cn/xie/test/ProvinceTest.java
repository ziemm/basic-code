package cn.xie.test;

import cn.xie.utils.JDBCUtils;
import org.junit.Test;

import javax.sql.DataSource;

/**
 * @author: xie
 * @create: 2019-11-26 19:51
 **/
public class ProvinceTest {
    @Test
    public void test1(){
        DataSource dataSource = JDBCUtils.getDataSource();
    }
}
