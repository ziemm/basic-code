package cn.xie.demo25_visitor;

/**
 * @author: xie
 * @create: 2020-04-30 14:59
 **/
public class Client {
    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();
        o.attach(new Man());
        o.attach(new Woman());

        Success v1 = new Success();
        o.display(v1);

        Failing v2 = new Failing();
        o.display(v2);
    }
}
