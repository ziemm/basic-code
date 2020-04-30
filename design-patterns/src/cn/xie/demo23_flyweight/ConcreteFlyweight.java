package cn.xie.demo23_flyweight;

/**
 * @author: xie
 * @create: 2020-04-30 09:10
 **/
public class ConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("具体Flyweight:(外部状态)"+extrinsicstate);
    }
}
