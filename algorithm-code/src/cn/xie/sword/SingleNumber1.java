package cn.xie.sword;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 使用位运算
 * @author: xie
 * @create: 2020-11-01 16:21
 **/
public class SingleNumber1 {
    public int singleNumber(int[] nums) {
        int res=0;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }
}
