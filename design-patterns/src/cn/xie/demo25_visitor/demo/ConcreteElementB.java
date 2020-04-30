package cn.xie.demo25_visitor.demo;

/**
 * @author: xie
 * @create: 2020-04-30 15:05
 **/
public class ConcreteElementB extends Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }

    public void otherOperation(){
        System.out.println("该元素其他操作方法");
    }
}
