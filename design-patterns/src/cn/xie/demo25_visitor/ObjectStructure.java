package cn.xie.demo25_visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xie
 * @create: 2020-04-30 14:55
 **/
public class ObjectStructure {
    private List<Person> elements = new ArrayList<>();

    public void attach(Person element){
        elements.add(element);
    }

    public void detach(Person element){
        elements.remove(element);
    }

    public void display(Action visitor){
        for (Person person : elements) {
            person.accept(visitor);
        }
    }
}
