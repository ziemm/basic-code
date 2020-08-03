package cn.xie.demo17_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author: xie
 * @create: 2020-04-22 22:52
 **/
public class ConcreteAggregate extends Aggregate {
    private List<Object> items = new ArrayList();
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int count(){
        return items.size();
    }

}
