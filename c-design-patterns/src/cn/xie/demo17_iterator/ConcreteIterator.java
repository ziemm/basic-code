package cn.xie.demo17_iterator;

/**
 * @author: xie
 * @create: 2020-04-22 22:49
 **/
public class ConcreteIterator extends Iterator {
    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public boolean isDone() {
        return false;
    }

    @Override
    public Object currentItem() {
        return null;
    }
}
