package cn.xie.demo03_decorate;

/**
 * @author: xie
 * @create: 2020-04-16 14:37
 **/
public class ConcreteComponent extends Component {
    @Override
    public void Operation() {
        System.out.println("具体对象的操作！");
    }
}
