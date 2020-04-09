package cn.xie.dem01_simple_bean_factory;

/**
 * @author: xie
 * @create: 2020-04-09 11:27
 **/
public class Client {
    public static void main(String[] args) {

        Operation operate = OperationFactory.createOperate("+");

        /*operate.numbaerA=1;
        operate.numbaerB=2;
        double result = operate.getResult();
        System.out.println(result);*/

        //测试继承过程中的变量变化，具体看源代码
        OperationAdd operationAdd = new OperationAdd();
        operationAdd.testVariable();
    }
}
