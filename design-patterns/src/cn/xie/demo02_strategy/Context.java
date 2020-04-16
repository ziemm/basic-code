package cn.xie.demo02_strategy;

/**
 * Context，将对策略的使用灵活起来
 * @author: xie
 * @create: 2020-04-15 23:18
 **/
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //上下文接口
    public void ContextInterface(){
        strategy.AlgorithmInterface();
    }
}
