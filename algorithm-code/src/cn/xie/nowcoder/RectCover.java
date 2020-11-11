package cn.xie.nowcoder;

/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * 比如n=3时，2*3的矩形块有3种覆盖方法：
 * 解题思路：斐波那切数列
 * 例如2*1的小矩形去覆盖2*8的矩形。1.考虑竖着放。剩下的就是f(7)；2.考虑横着放，左上角放一个，则左下角也得放一个，这个是一种方法，剩下的就是f(6)
 *
 * @author: xie
 * @create: 2020-11-11 10:40
 **/
public class RectCover {
    public int RectCover(int target) {
        if (target < 1)
            return 0;
        if (target == 1)
            return 1;
        else if (target == 2)
            return 2;
        else {
            return RectCover(target - 1) + RectCover(target - 2);
        }
    }

    /*非递归写法*/
    public int RectCover1(int target) {
        if (target < 1)
            return 0;
        if (target == 1)
            return 1;
        if (target == 2)
            return 2;
        int res = 0;
        int first = 1;
        int second = 2;
        for (int i = 3; i <= target; i++) {
            res = first + second;
            first = second;
            second = res;
        }
        return res;
    }
}
