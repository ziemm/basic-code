package cn.xie.demo20_command.demo;

/**
 * @author: xie
 * @create: 2020-04-24 15:19
 **/
public class ConcreteCommand extends Command {
    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void ecexute() {
        receiver.action();
    }
}
