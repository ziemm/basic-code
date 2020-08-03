package cn.xie.demo25_visitor;

/**
 * @author: xie
 * @create: 2020-04-30 14:51
 **/
public class Failing extends Action {
    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName()+this.getClass().getSimpleName()+"时的反应");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {

        System.out.println(concreteElementB.getClass().getSimpleName()+this.getClass().getSimpleName()+"时的反应");
    }
}
