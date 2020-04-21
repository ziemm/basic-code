package cn.xie.demo16_composite;

/**
 * @author: xie
 * @create: 2020-04-21 22:39
 **/
public abstract class Component {
    protected String name;
    public Component(String name){
        this.name = name;
    }

    public abstract void add(Component c);
    public abstract void remove(Component c);
    public abstract void display(int depth);
}
