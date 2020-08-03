package cn.xie.demo03_decorate.demo;

/**
 * @author: xie
 * @create: 2020-04-16 15:30
 **/
public class Client {
    public static void main(String[] args) {
        Person xc = new Person("小菜");

        System.out.println("装饰后：");
        Tshirt tshirt = new Tshirt();
        BigTrouser bigTrouser = new BigTrouser();

        tshirt.decorate(xc);
        bigTrouser.decorate(tshirt);
        bigTrouser.show();

    }
}
