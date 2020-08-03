package cn.xie.demo04_proxy;

/**
 * 追求者类
 * @author: xie
 * @create: 2020-04-18 09:57
 **/
public class Pursuit  implements GiveGift{
    SchoolGirl mm;
    public Pursuit(SchoolGirl mm){
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println(mm.getName()+"送你洋娃娃");

    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.getName()+"送你鲜花");

    }

    @Override
    public void giveChoolate() {
        System.out.println(mm.getName()+"送你巧克力");
    }
}
