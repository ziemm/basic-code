package cn.xie.demo20_command.demo;

/**
 * @author: xie
 * @create: 2020-04-24 15:23
 **/
public class Client {
    public static void main(String[] args) {
        Receiver r = new Receiver();
        Command c = new ConcreteCommand(r);
        Invoker i = new Invoker();
        i.setCommand(c);
        i.executeCommand();
    }
}
