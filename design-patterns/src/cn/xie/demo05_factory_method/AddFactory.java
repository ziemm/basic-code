package cn.xie.demo05_factory_method;

/**
 * @author: xie
 * @create: 2020-04-19 08:47
 **/
public class AddFactory implements Ifactory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
