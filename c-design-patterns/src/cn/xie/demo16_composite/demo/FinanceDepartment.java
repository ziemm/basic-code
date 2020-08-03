package cn.xie.demo16_composite.demo;

/**
 * @author: xie
 * @create: 2020-04-21 23:18
 **/
public class FinanceDepartment extends Company {
    public FinanceDepartment(String name) {
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
        System.out.println("公司财务管理--"+name);
    }
}
