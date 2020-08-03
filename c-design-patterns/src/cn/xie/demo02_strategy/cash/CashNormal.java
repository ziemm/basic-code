package cn.xie.demo02_strategy.cash;

/**
 * @author: xie
 * @create: 2020-04-16 08:49
 **/
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
