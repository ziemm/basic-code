package cn.xie.demo25_visitor.demo;

/**
 * @author: xie
 * @create: 2020-04-30 15:17
 **/
public class Client {
    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();
        o.attach(new ConcreteElementA());
        o.attach(new ConcreteElementB());

        ConcreteVisitor1 v1 = new ConcreteVisitor1();
        ConcreteVisitor2 v2 = new ConcreteVisitor2();
        o.display(v1);
        o.display(v2);
    }
}
