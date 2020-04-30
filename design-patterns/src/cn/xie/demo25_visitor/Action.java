package cn.xie.demo25_visitor;



/**
 * @author: xie
 * @create: 2020-04-30 14:43
 **/
public abstract class Action {
    public abstract void getManConclusion(Man concreteElementA);

    public abstract void getWomanConclusion(Woman concreteElementB);
}
