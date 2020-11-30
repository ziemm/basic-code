package cn.xie.nowcoder;

/**
 * @author: xie
 * @create: 2020-11-30 09:37
 **/
public class NumberOf1Between1AndN {
    public int NumberOf1Between1AndN_Solution(int n) {
        return dfs(n);
    }

    public int dfs(int n){
        if(n<=0)
            return 0;
        String strNum = String.valueOf(n);
        int high =  strNum.charAt(0)-'0';
        int pow = (int) Math.pow(10,strNum.length()-1);
        int last = n-pow*high;
        if(high==1){
            /*以1234为例
              (1):pow-1:[0-999]
              (2):last:234:
              (3):固定高位1，则每一个和高位组合就是一个，再加1与000组合
            * */
            return dfs(pow-1)+dfs(last)+last+1;
        }else{
            /*高位不为1，以2234为例
            (1)固定高位1，出现的次数。2234的pow为1000，则会有1000次。若为22234则pow为10000，则会出现10000次
            (2)high*dfs(pow-1)代表[0-999][1000-1999]中第三位出现的次数。若high=3，则代表[0-999][1000-1999][2000-2999]
            (3)最后是dfs(last)
            * */
            return pow+high*dfs(pow-1)+dfs(last);
        }
    }
}
