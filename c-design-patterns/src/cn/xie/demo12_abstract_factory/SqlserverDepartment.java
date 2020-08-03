package cn.xie.demo12_abstract_factory;

/**
 * @author: xie
 * @create: 2020-04-20 22:38
 **/
public class SqlserverDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在SQL Server中给department添加一条记录");
    }

    @Override
    public Department getGepartment(int id) {
        System.out.println("在SQL Server中根据id给department添加一条记录");
        return null;
    }
}
