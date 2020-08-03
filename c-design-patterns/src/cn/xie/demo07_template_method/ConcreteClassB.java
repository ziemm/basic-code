package cn.xie.demo07_template_method;

/**
 * @author: xie
 * @create: 2020-04-19 09:59
 **/
public class ConcreteClassB extends AbstractClass {
    @Override
    public void primitiveOperation1() {
        System.out.println("具体类B方法1实现");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("具体类B方法2实现");

    }
}
