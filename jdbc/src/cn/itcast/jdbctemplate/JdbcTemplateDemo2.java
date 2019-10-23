package cn.itcast.jdbctemplate;

import cn.itcast.domain.Person;
import cn.itcast.utils.JDBCUtilsDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 利用Template操纵数据库数据
 * @author: xie
 * @create: 2019-10-22 20:55
 **/
public class JdbcTemplateDemo2 {
    //创建JdbcTempLate对象
    private JdbcTemplate template = new JdbcTemplate(JDBCUtilsDataSource.getDataSource());

    /**
     * 1. 修改1号数据的 salary 为 10000
     */
    @Test
    public void test1(){
        //sql
        String sql = "update emp set sal = 10000 where empno = ?";
        int count = template.update(sql,7369);
        System.out.println(count);
    }

    /**
     * 2. 添加一条记录
     */
    @Test
    public void test2(){
        //sql
        String sql = "insert into emp(empno,ename,deptno) values(?,?,?)";
        int count = template.update(sql,7000,"白起",15);
        System.out.println(count);
    }

    /**
     * 3.删除刚才添加的记录
     */
    @Test
    public void test3(){
        String sql = "delete from emp where empno = ?";
        int count = template.update(sql, 7000);
        System.out.println(count);
    }

    /**
     * 4.查询id为7369的记录，将其封装为Map集合
     * 注意：这个方法查询的结果集长度只能是1
     */
    @Test
    public void test4(){
        String sql = "select * from emp where empno = ?";
        Map<String, Object> map = template.queryForMap(sql, 7369);
        System.out.println(map);
        //{id=1001, ename=孙悟空, job_id=4, mgr=1004, joindate=2000-12-17, salary=10000.00, bonus=null, dept_id=20}

    }

    /**
     * 5. 查询所有记录，将其封装为List
     */
    @Test
    public void test5(){
        String sql = "select * from emp";
        List<Map<String,Object>> list = template.queryForList(sql);

        for (Map<String, Object> stringObjectMap : list) {
            System.out.println(stringObjectMap);
        }
    }


    /**
     * 6. 查询所有记录，将其封装为Emp对象的List集合
     */

    @Test
    public void test6() {
        String sql = "select * from person";
        template.query(sql, new RowMapper<Person>() {
            @Override
            public Person mapRow(ResultSet resultSet, int i) throws SQLException {
                return null;
            }
        });
    }

    @Test
    public void test6_2() {
        String sql = "select * from person";
        List<Person> list = template.query(sql,new BeanPropertyRowMapper<Person>(Person.class));
        for (Person person : list) {
            System.out.println(person);
        }
    }

    /**
     * 7. 查询总记录数
     */

    @Test
    public void test7(){
        String sql = "select count(*) from emp";
        Long total = template.queryForObject(sql, Long.class);
        System.out.println(total);
    }
}
