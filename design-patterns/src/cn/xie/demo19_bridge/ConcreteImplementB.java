package cn.xie.demo19_bridge;

import cn.xie.demo09_facade.SubSystemOne;

/**
 * @author: xie
 * @create: 2020-04-23 10:27
 **/
public class ConcreteImplementB extends Implementor{
    @Override
    public void operation() {
        System.out.println("具体实现B的方法执行");
    }
}
