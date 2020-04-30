package cn.xie.demo25_visitor;

/**
 * @author: xie
 * @create: 2020-04-30 14:44
 **/
public class Woman extends Person {
    @Override
    public void accept(Action visitor) {
        visitor.getWomanConclusion(this);
    }
}
