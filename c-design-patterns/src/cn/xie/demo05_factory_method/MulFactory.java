package cn.xie.demo05_factory_method;

/**
 * @author: xie
 * @create: 2020-04-19 08:51
 **/
public class MulFactory implements Ifactory {
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
