package cn.xie.sword;

import java.util.HashSet;
import java.util.Set;

/**
 * 03.数组中重复的数字
 * @author: xie
 * @create: 2020-02-22 22:19
 **/
public class FindRepeatNumber {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};

        System.out.println(findRepeatNumber(nums));

    }

    /**
     * 利用set集合无法存放重复数字的性质
     *
     * @param nums
     * @return
     */
    public static int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        set.add(nums[0]);
        int currLength = set.size();
        for (int i = 1; i < nums.length; i++) {
            set.add(nums[i]);
            if (currLength == set.size()) {//增加了数字，set长度不变，说明是重复数字
                ans = nums[i];
                break; //符合条件跳出循环
            }
            currLength = set.size();
        }
        return ans;
    }

    /**
     * 优化解法：利用add（）方法的返回值
     * @param nums
     * @return
     */
    public int findRepeatNumber2(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int repeat = -1;
        for (int num : nums) {
            if (!set.add(num)) {
                repeat = num;
                break;
            }
        }
        return repeat;
    }
    /**
     * 优化解法：利用hash,key:数组中数字，value:数字出现次数
     * 不过利用了空间换时间
     * @param nums
     * @return
     */
    public int findRepeatNumber3(int[] nums) {

        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
            if(arr[nums[i]]>1){
                return nums[i];
            }
        }
        return -1;
    }

}
