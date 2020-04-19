package cn.xie.demo04_proxy;

/**
 * 代理类
 * @author: xie
 * @create: 2020-04-18 10:41
 **/
public class Proxy implements GiveGift{
    Pursuit gg;
    public Proxy(SchoolGirl mm){
        gg = new Pursuit(mm);
    }

    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveChoolate() {
        gg.giveChoolate();
    }
}
