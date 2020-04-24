package cn.xie.demo20_command;

/**
 * @author: xie
 * @create: 2020-04-23 23:15
 **/
public abstract class Command {
    protected Barbecuer receiver;
    public Command(Barbecuer receiver){
        this.receiver=receiver;
    }

    abstract public void excuteComand();
}
