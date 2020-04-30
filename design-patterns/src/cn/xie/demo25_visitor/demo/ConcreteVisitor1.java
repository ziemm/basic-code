package cn.xie.demo25_visitor.demo;

/**
 * @author: xie
 * @create: 2020-04-30 15:06
 **/
public class ConcreteVisitor1 extends Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName()+"被"+this.getClass().getSimpleName()+"访问");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(concreteElementB.getClass().getSimpleName()+"被"+this.getClass().getSimpleName()+"访问");

    }
}
