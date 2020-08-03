package cn.xie.demo15_memento;

/**
 * @author: xie
 * @create: 2020-04-21 10:42
 **/
public class Memento {

    private String state;
    Memento(String state){
        this.state=state;
    }

    public String getState() {
        return state;
    }
}
