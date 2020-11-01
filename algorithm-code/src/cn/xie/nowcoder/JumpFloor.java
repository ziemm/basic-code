package cn.xie.nowcoder;

/**
 * @author: xie
 * @create: 2020-10-29 10:33
 **/
public class JumpFloor {
    public int JumpFloor(int target) {
        int[] arr = new int[target + 1];
        if (target == 1)
            return 1;
        else if (target == 2)
            return 2;
        else {
            arr[1] = 1;
            arr[2] = 2;
            for (int i = 3; i <= target; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
        return arr[target];
    }

    /*变态跳台阶：
    * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
    * 分析：跳1级，剩下n-1级，剩下的跳法是f(n-1)
    *      跳2级，剩下n-2级，剩下的跳法是f(n-2)
    *      所以f(n)=f(n-1)+f(n-2)+...f(1)
    *      因为f(n-1)=f(n-2)+f(n-3)+...+f(1)
    *      所以f(n)=2*f(n-1)
    * */

    public int JumpFloor1(int target) {
        if(target<=0)
            return 0;
        if(target==1)
            return 1;
        int a=1;
        for (int i = 2; i <=target ; i++) {
            a *= 2;
        }
        return a;
    }
}
