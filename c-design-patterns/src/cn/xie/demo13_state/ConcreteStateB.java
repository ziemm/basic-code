package cn.xie.demo13_state;

/**
 * @author: xie
 * @create: 2020-04-20 23:17
 **/
public class ConcreteStateB extends State {
    @Override
    public void Handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}
