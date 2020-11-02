package cn.xie.sword;
/**
 * 剑指 Offer 56 - I. 数组中数字出现的次数
 * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)
 *
 * 思路：主要是想方法把这两个只出现一次的数字放到两个子数组中，然后再在子数组中利用异或的运算分别求出这两个数。
 *       分成两个数组的方法是根据数组异或结果的最低位1的位置n和数组的第n位与的结果进行划分
 * @author: xie
 * @create: 2020-07-31 22:43
 **/
public class SingleNumbers {
    public static void main(String[] args) {
        SingleNumbers o = new SingleNumbers();
        int[] nums = new int[]{1,2,5,2};
        int[] ints = o.singleNumbers(nums);
        System.out.println(ints);
    }
    public int[] singleNumbers(int[] nums) {
       int num = 0;
       //数组全员异或，找到两个出现1次数字的异或值
        for (int i = 0; i < nums.length; i++) {
            num ^= nums[i];
        }
        //从右向左找到num二进制为1的位数
        int count=0;
        while (num%2==0){
            num = num>>1; // 和  num = num/2 是一个效果，取整
            count++;
        }
        //根据num首次为1的位数将数组分成两个子数组,子数组再两两异或
        int mask = 1 << count;
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if((mask&nums[i])==0){
                //此时说明是第一组
                result[0] ^=nums[i];
            }else {
                result[1] ^=nums[i];
            }
        }
        return result;
    }
}
