package cn.xie.demo05_factory_method;



/**
 * @author: xie
 * @create: 2020-04-09 11:13
 **/
public class OperationMul extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = numbaerA*numbaerB;
        return result;
    }
}
