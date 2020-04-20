package cn.xie.demo12_abstract_factory;

/**
 * @author: xie
 * @create: 2020-04-20 22:44
 **/
public class SqlServerFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new SqlserverUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlserverDepartment();
    }
}
