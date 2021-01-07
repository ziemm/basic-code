package cn.xie.homework2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: xie
 * @create: 2020-10-18 19:57
 **/
public class YiDong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
