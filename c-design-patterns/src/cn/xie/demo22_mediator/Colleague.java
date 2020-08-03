package cn.xie.demo22_mediator;

/**
 * @author: xie
 * @create: 2020-04-27 16:22
 **/
public abstract class Colleague {
    protected Mediator mediator;
    //构造方法，得到中介者对象
    Colleague(Mediator mediator){
        this.mediator = mediator;
    }
}
