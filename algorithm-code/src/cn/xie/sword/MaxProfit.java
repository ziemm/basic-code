package cn.xie.sword;

/**
 * 维护一个最小值，若有比当前值小的price，更新min
 * 如果当前price比min大，更新一下利润
 * @author: xie
 * @create: 2020-08-08 21:31
 **/
public class MaxProfit {
    public int maxProfit(int[] prices){
        if(prices==null || prices.length<=1)
            return 0;
        int min = prices[0];
        int res = 0;
        for (int i = 1;i < prices.length; i++) {
           if(prices[i]<=min){
               min = prices[i];
           }else {
               res = Math.max(res,prices[i]-min);
           }
        }
        return res;
    }
}
