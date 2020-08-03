package cn.xie.sword;

/**
 * @author: xie
 * @create: 2020-08-01 22:06
 **/
public class SingleNumber {
    public int singleNumber(int[] nums) {
        if(nums.length==0) return -1;
        int[] bitSum = new int[32]; //java int类型有32位
        int res = 0;
        for (int num : nums) {
            int bitMask = 1;
            for(int i =31;i>=0;i--){
                if((num&bitMask)!=0)//说明此时该位不是0
                    bitSum[i]++;
                bitMask=bitMask << 1; //mask左移
            }
        }
        for(int i = 0;i<32;i++){
            res = res << 1; //二进制进位
            res += bitSum[i]%3;
        }
        return res;
    }
}
