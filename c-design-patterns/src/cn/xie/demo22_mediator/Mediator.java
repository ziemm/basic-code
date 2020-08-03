package cn.xie.demo22_mediator;

/**
 * @author: xie
 * @create: 2020-04-27 16:21
 **/
public abstract class Mediator {
    public abstract void send(String message,Colleague colleague);
}
