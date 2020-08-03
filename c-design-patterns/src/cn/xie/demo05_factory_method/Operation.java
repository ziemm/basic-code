package cn.xie.demo05_factory_method;

/**
 * 计算的抽象类，会被实例陈各种类型的计算
 * @author: xie
 * @create: 2020-04-09 10:46
 **/
public abstract class Operation {
    protected double numbaerA=0;
    protected double numbaerB=0;

    public double getNumbaerA() {
        return numbaerA;
    }

    public void setNumbaerA(double numbaerA) {
        this.numbaerA = numbaerA;
    }

    public double getNumbaerB() {
        return numbaerB;
    }

    public void setNumbaerB(double numbaerB) {
        this.numbaerB = numbaerB;
    }
    
    public double getResult(){
        double result = 0;
        return result;
    }

}
