package cn.xie.demo25_visitor;

/**
 * @author: xie
 * @create: 2020-04-30 14:47
 **/
public abstract class Person {
    public abstract void accept(Action visitor);
}
