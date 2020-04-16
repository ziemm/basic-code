package cn.xie.demo02_strategy.cash;

/**
 * @author: xie
 * @create: 2020-04-16 08:51
 **/
public class CashRebate extends CashSuper {
    private double moneyRebate;

    //初始化时需要输入打折费率
    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money*moneyRebate;
    }
}
