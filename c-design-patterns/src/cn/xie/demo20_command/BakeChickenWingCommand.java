package cn.xie.demo20_command;

/**
 * @author: xie
 * @create: 2020-04-24 15:02
 **/
public class BakeChickenWingCommand extends Command {
    public BakeChickenWingCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void excuteComand() {
        receiver.bakeChikenWing();
    }
}
