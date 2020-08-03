package cn.xie.demo23_flyweight;

/**
 * @author: xie
 * @create: 2020-04-30 09:19
 **/
public class Client {
    public static void main(String[] args) {
        int extrinsicstate = 22;//代码外部状态

        FlyweightFactory f = new FlyweightFactory();
        Flyweight x = f.getFlyweight("X");
        x.operation(--extrinsicstate);

        Flyweight y = f.getFlyweight("Y");
        y.operation(--extrinsicstate);

        UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();

        uf.operation(--extrinsicstate);

    }
}
