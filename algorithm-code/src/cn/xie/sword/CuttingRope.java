package cn.xie.sword;

/**
 * 面试题14-1：剪绳子
 * @author: xie
 * @create: 2020-03-31 16:25
 **/
public class CuttingRope {
    public static void main(String[] args) {
        CuttingRope obj = new CuttingRope();
        int result = obj.cuttingRope2(10);
        System.out.println(result);
    }

    /**
     * 动态规划的算法：应为绳子的每个子长度的最优解是最后总长度的最优解，
     * 所以先求出子长度的最优解，使用dp数组存放各子长度的最优解
     * @param n
     * @return
     */
    public int cuttingRope(int n) {
        if(n<2)
            return 0;
        if(n==2)
            return 1;
        if(n==3)
            return 2;
        //当长度超过4时
        int[] dp = new int[n+1];//存放各个子长度的最优解
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;

        int max =0;
        for (int i = 4; i <= n; i++) {//以此计算子长度4，5，6...n的各子长度最优解
            max=0;
            int temp=0;
            for (int j = 1; j <=i/2 ; j++) {
                 temp= dp[j]*dp[i-j]; //各种子长度相乘的临时解
                if(max<temp){
                    max=temp;
                }
            }
            dp[i]=max;
        }
        max=dp[n];
        return max;
    }

    /**
     * 贪婪算法
     * @param n
     * @return
     */
    public int cuttingRope2(int n) {
        if(n<2)
            return 0;
        if(n==2)
            return 1;
        if(n==3)
            return 2;
        //尽可能得减去长度为3的片段
        int timesOf3=n/3;
        //当绳子剩下4的时候切为2*2
        if(n-timesOf3*3==1)
            timesOf3 -=1;

        int timesOf2 =(n-timesOf3*3)/2;

        return (int)(Math.pow(3,timesOf3)*(int)Math.pow(2,timesOf2));
    }
}
