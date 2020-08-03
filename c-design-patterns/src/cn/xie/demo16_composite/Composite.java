package cn.xie.demo16_composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xie
 * @create: 2020-04-21 22:45
 **/
public class Composite extends Component {
    private List<Component> children = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        System.out.println("组件中的display方法");
        for (Component component : children) {
            component.display(depth+2);
        }
    }
}
