package cn.xie.demo05_factory_method;

/**
 * @author: xie
 * @create: 2020-04-19 08:53
 **/
public class Client {
    public static void main(String[] args) {
        Ifactory openFactory = new AddFactory();
        Operation operation = openFactory.createOperation();
        operation.numbaerA = 1;
        operation.numbaerB = 2;
        double result = operation.getResult();
        System.out.println(result);
    }
}
