package cn.xie.demo03_decorate;

/**
 * @author: xie
 * @create: 2020-04-16 14:56
 **/
public class ConcreteDecotetorB extends Decorator {
    @Override
    public void Operation() {
        super.Operation();
        addedBehavior();
        System.out.println("装饰对象B的操作");
    }

    private void addedBehavior() {
        System.out.println("具体装饰对象B独有的方法");
    }
}
