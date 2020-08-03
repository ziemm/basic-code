package cn.xie.demo25_visitor.demo;

/**
 * @author: xie
 * @create: 2020-04-30 15:09
 **/
public abstract class Element {
    public abstract void accept(Visitor visitor);
}
