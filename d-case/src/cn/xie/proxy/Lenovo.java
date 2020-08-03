package cn.xie.proxy;

/**
 * 代理模式的真实类
 * @author: xie
 * @create: 2019-11-14 22:34
 **/
public class Lenovo implements SaleComputer {
    @Override
    public String sale(double money) {
        System.out.println("花了"+money+"元买了一台联想电脑...");
        return "联想电脑";
    }

    @Override
    public void show() {
        System.out.println("展示电脑....");
    }
}
