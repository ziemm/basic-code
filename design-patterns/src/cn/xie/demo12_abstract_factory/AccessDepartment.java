package cn.xie.demo12_abstract_factory;

/**
 * @author: xie
 * @create: 2020-04-20 22:40
 **/
public class AccessDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在Access中给department添加一条记录");
    }

    @Override
    public Department getGepartment(int id) {
        System.out.println("在Access中根据ID得到一条记录");
        return null;
    }
}
