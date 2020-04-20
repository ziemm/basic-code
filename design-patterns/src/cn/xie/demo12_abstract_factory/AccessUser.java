package cn.xie.demo12_abstract_factory;

/**
 * @author: xie
 * @create: 2020-04-20 22:35
 **/
public class AccessUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在Access中给user添加一条记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在Access中根据Id 获得user一条记录");
        return null;
    }
}
