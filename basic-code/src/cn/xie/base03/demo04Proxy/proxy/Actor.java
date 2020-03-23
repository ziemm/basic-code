package cn.xie.base03.demo04Proxy.proxy;

/**
 * 实现了接口的实现，表明已经是符合经纪公司要求的演员
 * @author: xie
 * @create: 2020-03-01 23:10
 **/
public class Actor implements IActor {
    @Override
    public void baseAct(float money) {
        System.out.println("拿到钱，开始基本表演："+money);
    }

    @Override
    public void dangerAct(float money) {
        System.out.println("拿到钱，开始危险表演："+money);

    }

    @Override
    public float specialAct(float money) {
        System.out.println("拿到钱，开始特别表演表演："+money);
        return (float) (0.1*money);
    }
}
