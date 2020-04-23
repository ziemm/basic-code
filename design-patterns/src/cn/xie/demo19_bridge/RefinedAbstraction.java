package cn.xie.demo19_bridge;

/**
 * @author: xie
 * @create: 2020-04-23 10:46
 **/
public class RefinedAbstraction extends Abstraction {
    @Override
    public void operation() {
        implementor.operation();
    }
}
