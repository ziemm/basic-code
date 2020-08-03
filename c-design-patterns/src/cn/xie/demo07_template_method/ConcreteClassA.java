package cn.xie.demo07_template_method;

/**
 * @author: xie
 * @create: 2020-04-19 09:57
 **/
public class ConcreteClassA extends AbstractClass {
    @Override
    public void primitiveOperation1() {
        System.out.println("具体类A方法1实现");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("具体类A方法2实现");

    }
}
