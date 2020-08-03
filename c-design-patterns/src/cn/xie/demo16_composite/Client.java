package cn.xie.demo16_composite;

/**
 * @author: xie
 * @create: 2020-04-21 22:51
 **/
public class Client {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("leaf XA"));
        comp.add(new Leaf("leaf XB"));

        root.add(comp);

        root.display(1);
    }
}
