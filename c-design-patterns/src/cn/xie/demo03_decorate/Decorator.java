package cn.xie.demo03_decorate;

/**
 * 装饰类
 * @author: xie
 * @create: 2020-04-16 14:39
 **/
public abstract class Decorator extends Component {

    protected Component component;

    public void setComponent(Component component){//设置Component
        this.component=component;
    }

    @Override
    public void Operation() {
        //实际执行的是Component的Operation
        if(component!=null){
            component.Operation();
        }
    }
}
