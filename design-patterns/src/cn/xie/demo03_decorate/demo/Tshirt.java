package cn.xie.demo03_decorate.demo;

/**
 * @author: xie
 * @create: 2020-04-16 15:28
 **/
public class Tshirt extends Finery {
    @Override
    public void show() {
        System.out.println("大T恤");
        super.show();
    }
}
