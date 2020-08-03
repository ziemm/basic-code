package cn.xie.demo20_command.demo;

/**
 * @author: xie
 * @create: 2020-04-24 15:17
 **/
public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver){
        this.receiver=receiver;
    }

    public abstract void ecexute();
}
