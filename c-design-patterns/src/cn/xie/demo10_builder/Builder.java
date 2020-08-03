package cn.xie.demo10_builder;

/**
 * 抽象建造者类，确定由两个部件partA和partB组成
 * @author: xie
 * @create: 2020-04-20 08:56
 **/
public abstract class Builder {
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract Product getResult();
}
