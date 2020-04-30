package cn.xie.demo25_visitor.demo;


import java.util.ArrayList;
import java.util.List;

/**
 * @author: xie
 * @create: 2020-04-30 15:12
 **/
public class ObjectStructure {
    private List<Element> elements = new ArrayList<>();

    public void attach(Element element){
        elements.add(element);
    }

    public void detach(Element element){
        elements.remove(element);
    }

    public void display(Visitor visitor){
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
