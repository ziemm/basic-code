package cn.xie.demo01_simple_bean_factory;

/**
 * @author: xie
 * @create: 2020-04-09 11:12
 **/
public class OperationSub extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = numbaerA-numbaerB;
        return result;
    }
}
