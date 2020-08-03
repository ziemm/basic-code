package cn.xie.demo07_template_method;

/**
 * @author: xie
 * @create: 2020-04-19 09:52
 **/
public abstract class AbstractClass {

    //一些抽象行为放到子类中去做
    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();

    //模板方法
    public void TemplateMethod(){
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("模板方法调用了");
    }
}
