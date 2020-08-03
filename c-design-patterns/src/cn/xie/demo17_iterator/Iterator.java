package cn.xie.demo17_iterator;

/**
 * @author: xie
 * @create: 2020-04-22 22:45
 **/
public abstract class Iterator {
    public abstract Object first();
    public abstract Object next();
    public abstract boolean isDone();
    public abstract Object currentItem();
}
