package cn.xie.demo02_strategy.cash;

/**
 * @author: xie
 * @create: 2020-04-16 08:55
 **/
public class CashReturn extends CashSuper {
    private double moneyCondition; //返利条件
    private double moneyReturn = 0.0d; //返利费用

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;

        if(money>=moneyCondition){
           result = money-Math.floor(money/moneyCondition)*moneyReturn;
           System.out.println(Math.floor(money/moneyCondition));
        }
        return result;
    }
}
