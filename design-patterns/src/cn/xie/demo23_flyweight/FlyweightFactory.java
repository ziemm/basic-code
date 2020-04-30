package cn.xie.demo23_flyweight;

import java.util.Hashtable;

/**
 * @author: xie
 * @create: 2020-04-30 09:14
 **/
public class FlyweightFactory {
    private Hashtable flyweights = new Hashtable();

    public FlyweightFactory(){
        flyweights.put("X",new ConcreteFlyweight());
        flyweights.put("Y",new ConcreteFlyweight());
        flyweights.put("Z",new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key){
        return (Flyweight) flyweights.get(key);
    }
}
