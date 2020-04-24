package cn.xie.demo01_simple_bean_factory;

/**
 * @author: xie
 * @create: 2020-04-09 11:03
 **/
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = numbaerA+numbaerB;
        return result;
    }

    public void testVariable(){
        System.out.println("this.numbaerA:"+this.numbaerA);
        System.out.println("super.numbaerA:"+super.numbaerA);
        System.out.println(this.numbaerA==super.numbaerA);
        System.out.println(numbaerA==this.numbaerA);
        System.out.println(numbaerA==super.numbaerA);
    }
}
