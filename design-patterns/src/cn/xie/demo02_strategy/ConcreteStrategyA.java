package cn.xie.demo02_strategy;

/**
 * @author: xie
 * @create: 2020-04-15 23:15
 **/
public class ConcreteStrategyA extends Strategy {
    @Override
    public void AlgorithmInterface() {
        System.out.println("算法A实现");
    }
}
