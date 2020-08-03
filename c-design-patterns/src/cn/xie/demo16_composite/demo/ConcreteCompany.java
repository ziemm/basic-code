package cn.xie.demo16_composite.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝节点
 * @author: xie
 * @create: 2020-04-21 23:07
 **/
public class ConcreteCompany extends Company {
    private List<Company> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
        children.add(c);
    }

    @Override
    public void remove(Company c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        System.out.println("深度为："+depth+"--"+name);
        for (Company component : children) {
            component.display(depth+2);
        }
    }

    @Override
    public void LineOfDuty() {
        for (Company component : children) {
            component.LineOfDuty();
        }
    }
}
