package cn.xie.demo03_decorate;

/**
 * @author: xie
 * @create: 2020-04-16 14:51
 **/
public class ConcreteDecotetorA extends Decorator {

    private String addedState;//本类独有功能

    @Override
    public void Operation() {
        super.Operation();//运行原Component的Operation
        addedState = "new State";
        System.out.println(addedState);
    }
}
