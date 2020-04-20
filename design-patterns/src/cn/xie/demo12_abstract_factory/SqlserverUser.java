package cn.xie.demo12_abstract_factory;

/**
 * @author: xie
 * @create: 2020-04-20 22:32
 **/
public class SqlserverUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在SQL Server中给user添加一条记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在SQL Server中根据Id 获得user一条记录");
        return null;
    }
}
