package cn.xie.demo15_memento;

/**
 * @author: xie
 * @create: 2020-04-21 10:48
 **/
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
