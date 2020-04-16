package cn.xie.demo02_strategy;

/**
 * @author: xie
 * @create: 2020-04-15 23:21
 **/
public class Client {
    public static void main(String[] args) {
        Context context;

        //实例化不同策略
        context = new Context(new ConcreteStrategyA());
        context.ContextInterface();

        context = new Context(new ConcreteStrategyB());
        context.ContextInterface();

        context = new Context(new ConcreteStrategyC());
        context.ContextInterface();
    }
}
