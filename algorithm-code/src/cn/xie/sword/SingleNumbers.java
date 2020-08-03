package cn.xie.sword;
/**
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
