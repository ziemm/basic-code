package cn.xie.demo13_state;

/**
 * 具体状态：每一个子类实现一个与Context的一个状态相关的行为
 * @author: xie
 * @create: 2020-04-20 23:10
 **/
public class ConcreteStateA extends State {
    @Override
    public void Handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}
