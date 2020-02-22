package cn.xie.homework4;

import java.util.Scanner;

/**
 * @author: xie
 * @create: 2019-12-16 11:09
 **/
public class T5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String temp = in.nextLine();
        String[] ss = temp.trim().split(" ");
        int[] arr = new int[6];
        for(int i = 0; i < 6; i++){
            arr[i] = Integer.parseInt(ss[i]);
        }
        int size = 0;
        for(int n : arr)
            size += n;
        int[] arr1 = new int[size];
        int index = 0;
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < arr[i]; j++){
                arr1[index++] = i + 1;
            }
        }
//        for(int n : arr1)
//            System.out.println(n);

        if(canPartition(arr1)){
            System.out.println("Can be divided.");
        }else{
            System.out.println("Can't be divided.");
        }
    }
    private static boolean canPartition(int[] nums) {
        int size = nums.length;
        int s = 0;
        for (int num : nums) {
            s += num;
        }
        // 特判 2：如果是奇数，就不符合要求
        if ((s & 1) == 1) {
            return false;
        }
        int target = s / 2;
        // 创建二维状态数组，行：物品索引，列：容量
        boolean[][] dp = new boolean[size][target + 1];
        // 先写第 1 行
        for (int i = 1; i < target + 1; i++) {
            if (nums[0] == i) {
                dp[0][i] = true;
            }
        }
        //1，5，11，5
        for (int i = 1; i < size; i++) {
            for (int j = 0; j < target + 1; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= nums[i]) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i]];
                }
            }
        }
        return dp[size - 1][target];
    }
}
