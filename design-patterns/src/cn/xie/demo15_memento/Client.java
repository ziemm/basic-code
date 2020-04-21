package cn.xie.demo15_memento;

/**
 * @author: xie
 * @create: 2020-04-21 10:48
 **/
public class Client {
    public static void main(String[] args) {
        Originator o = new Originator();
        o.setState("On");
        o.show();

        Caretaker c = new Caretaker();
        c.setMemento(o.createMemento());

        o.setState("Off");
        o.show();

        o.setMemento(c.getMemento());//恢复到原始状态
        o.show();
    }
}
