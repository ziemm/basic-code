package cn.xie.demo25_visitor;

/**
 * @author: xie
 * @create: 2020-04-30 14:48
 **/
public class Success extends Action {
    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName()+this.getClass().getSimpleName()+"时，背后多半有一个伟大的女人");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getClass().getSimpleName()+this.getClass().getSimpleName()+"时，背后多半有一个不成功的男人");

    }
}
