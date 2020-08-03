package cn.xie.demo19_bridge;

/**
 * @author: xie
 * @create: 2020-04-23 10:26
 **/
public class ConcreteImplementA extends Implementor{
    @Override
    public void operation() {
        System.out.println("具体实现A的方法执行");
    }
}
