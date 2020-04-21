package cn.xie.demo15_memento;

/**
 * @author: xie
 * @create: 2020-04-21 10:37
 **/
public class Originator {
    private String state;//需要保存的属性，可能有多个

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }
    public void setMemento(Memento memento){
        state=memento.getState();
    }

    public void show(){
        System.out.println("State:"+state);
    }
}
