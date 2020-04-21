package cn.xie.demo16_composite;

/**
 * @author: xie
 * @create: 2020-04-21 22:42
 **/
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("Cannot add a leaf");
    }

    @Override
    public void remove(Component c) {
        System.out.println("Cannot remove from a leaf");

    }

    @Override
    public void display(int depth) {
        System.out.println("叶子节点的具体方法！");
    }
}
