package cn.xie.dem01_simple_bean_factory;

/**
 * @author: xie
 * @create: 2020-04-09 11:19
 **/
public class OperationFactory {

    public static Operation createOperate(String operate){
        Operation oper = null;

        switch(operate){
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            default:
                System.out.println("未知错误！");
        }
        return oper;
    }

}
