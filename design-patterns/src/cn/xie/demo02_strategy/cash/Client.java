package cn.xie.demo02_strategy.cash;

/**
 * @author: xie
 * @create: 2020-04-16 09:13
 **/
public class Client {
    public static void main(String[] args) {
        //模拟花费
        double consume = 500;
        //模拟最后应收的钱
        double total;

        //CashContext csuper = new CashContext("打八折");
        CashContext csuper = new CashContext("满300-100");

        total = csuper.GetResult(consume);
        System.out.println("最后应收："+total);
    }
}
