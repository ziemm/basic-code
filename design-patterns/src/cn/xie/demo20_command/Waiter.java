package cn.xie.demo20_command;

/**
 * @author: xie
 * @create: 2020-04-24 15:03
 **/
public class Waiter {
    private Command command;

    public void setOrder(Command command){
        this.command=command;
    }

    public void notify1(){
        command.excuteComand();
    }

}
