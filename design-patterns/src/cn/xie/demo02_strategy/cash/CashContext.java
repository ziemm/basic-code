package cn.xie.demo02_strategy.cash;

/**
 * 策略模式与简单工厂模式结合
 * @author: xie
 * @create: 2020-04-16 09:05
 **/
public class CashContext {
    private CashSuper cs=null;

    public CashContext(String type) {
        switch (type){
            case "正常收费":
                CashNormal cashNormal = new CashNormal();
                cs = cashNormal;
                break;
            case "打八折":
                CashRebate cashRebate = new CashRebate(0.8d);
                cs = cashRebate;
                break;
            case "满300-100":
                CashReturn cashReturn = new CashReturn(300, 100);
                cs = cashReturn;
                break;
        }
    }

    public double GetResult(double money){
        return cs.acceptCash(money);
    }
}
