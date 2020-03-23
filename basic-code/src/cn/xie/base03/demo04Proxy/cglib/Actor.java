package cn.xie.base03.demo04Proxy.cglib;

/**
 * @author: xie
 * @create: 2020-03-04 23:41
 **/
public class Actor {

    public void baseAct(float money) {
        System.out.println("拿到钱，开始基本表演："+money);
    }

    public void dangerAct(float money) {
        System.out.println("拿到钱，开始危险表演："+money);

    }

    public float specialAct(float money) {
        System.out.println("拿到钱，开始特别表演表演："+money);
        return (float) (0.1*money);
    }
}
