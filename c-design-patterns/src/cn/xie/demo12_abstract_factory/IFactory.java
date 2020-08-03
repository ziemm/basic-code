package cn.xie.demo12_abstract_factory;

public interface IFactory {
    IUser createUser();
    IDepartment createDepartment();
}
