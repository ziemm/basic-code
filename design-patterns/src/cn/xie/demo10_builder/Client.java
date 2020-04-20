package cn.xie.demo10_builder;

/**
 * @author: xie
 * @create: 2020-04-20 09:06
 **/
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();

        //指挥者用来具体的建造者来构建产品
        director.construct(b1);
        Product p1 = b1.getResult();
        p1.show();

        director.construct(b2);
        Product p2 = b2.getResult();
        p2.show();
    }


}
