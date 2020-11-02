package cn.xie.homework1;
import java.util.*;

/**
 * @author: xie
 * @create: 2020-08-23 15:55
 **/
public class Main {
    public static void main(String[] args) {
        int res =0;
        res =res <<1;
        res =res <<1;
        System.out.println(res);
    }
    public int[] singleNumbers(int[] nums) {
        int num = 0;
        //数组全员异或
        for (int i = 0; i < nums.length; i++) {
            num ^= nums[i];
        }
        //找到数组最低位为1的位置
        int count = 0;
        while (num%2==0){
            num >>= 1;
            count++;
        }
        int mask = 1<<count; //形成mask

        int[] result = new int[2];
        for (int n : nums) {
            if((n&mask)==0){
                result[0] ^= n;
            }else {
                result[1] ^= n;
            }
        }
        return result;
    }
}
