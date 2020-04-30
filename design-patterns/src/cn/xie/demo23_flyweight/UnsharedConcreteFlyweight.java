package cn.xie.demo23_flyweight;

import cn.xie.demo09_facade.SubSystemOne;

/**
 * @author: xie
 * @create: 2020-04-30 09:12
 **/
public class UnsharedConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("不共享的具体Flyweight："+extrinsicstate);
    }
}
