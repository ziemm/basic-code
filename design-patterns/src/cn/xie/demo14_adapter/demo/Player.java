package cn.xie.demo14_adapter.demo;

/**
 * @author: xie
 * @create: 2020-04-21 09:47
 **/
public abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }
    public abstract void attack();
    public abstract void defense();
}
