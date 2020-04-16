package cn.xie.demo03_decorate.demo;

/**
 * 服饰类（装饰人的装饰声明类）
 * @author: xie
 * @create: 2020-04-16 15:23
 **/
public class Finery extends Person {
    protected Person component;

    //打扮
    public void decorate(Person component){
        this.component=component; //获取到要装饰的对象
    }

    @Override
    public void show() {
        if(component!=null){
            component.show();
        }
    }
}
