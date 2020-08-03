package cn.xie.demo07_template_method;

/**
 * @author: xie
 * @create: 2020-04-19 09:59
 **/
public class Client {
    public static void main(String[] args) {
        AbstractClass c;
        c= new ConcreteClassA();
        c.TemplateMethod();

        c = new ConcreteClassB();
        c.TemplateMethod();
    }
}
