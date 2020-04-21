package cn.xie.demo15_memento.demo;

/**
 * @author: xie
 * @create: 2020-04-21 11:13
 **/

public class RoleStateCaretaker {
    private RoleStateMemento memento;

    public RoleStateMemento getMemento() {
        return memento;
    }

    public void setMemento(RoleStateMemento memento) {
        this.memento = memento;
    }
}
