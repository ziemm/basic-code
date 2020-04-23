package cn.xie.demo19_bridge;

/**
 * @author: xie
 * @create: 2020-04-23 10:29
 **/
public class Abstraction {
    protected Implementor implementor;

    public void setImplementor(Implementor implementor){
        this.implementor = implementor;
    }

    public void operation(){
        implementor.operation();
    }
}
