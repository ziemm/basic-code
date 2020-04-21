package cn.xie.demo16_composite.demo;

/**
 * 树叶节点
 * @author: xie
 * @create: 2020-04-21 23:15
 **/
public class HRDepartment extends Company {
    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void display(int depth) {
        System.out.println("深度为："+depth+"--"+name);

    }

    @Override
    public void LineOfDuty() {
            System.out.println("员工招聘管理--"+name);
    }
}
