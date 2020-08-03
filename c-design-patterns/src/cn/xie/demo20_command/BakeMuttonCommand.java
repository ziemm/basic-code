package cn.xie.demo20_command;

/**
 * @author: xie
 * @create: 2020-04-23 23:18
 **/
public class BakeMuttonCommand extends Command {
    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void excuteComand() {
        receiver.BakeMutton();
    }
}
