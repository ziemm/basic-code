package cn.xie.demo20_command;

/**
 * @author: xie
 * @create: 2020-04-24 15:05
 **/
public class Client {
    public static void main(String[] args) {

        //开门营业
        Barbecuer boy = new Barbecuer();
        Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);

        Command bakeChickenCommand1 = new BakeChickenWingCommand(boy);

        Waiter girl = new Waiter();

        //营业
        girl.setOrder(bakeMuttonCommand1);
        girl.notify1();
        girl.setOrder(bakeMuttonCommand2);
        girl.notify1();
        girl.setOrder(bakeChickenCommand1);
        girl.notify1();
    }
}
