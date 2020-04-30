package cn.xie.demo22_mediator;

/**
 * @author: xie
 * @create: 2020-04-27 16:31
 **/
public class ConcreteColleague2 extends Colleague {
    ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void notify1(String message){
        System.out.println("同事2得到消息"+message);
    }
}
