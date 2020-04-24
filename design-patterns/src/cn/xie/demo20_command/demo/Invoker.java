package cn.xie.demo20_command.demo;

/**
 * @author: xie
 * @create: 2020-04-24 15:22
 **/
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand(){
        command.ecexute();
    }
}
