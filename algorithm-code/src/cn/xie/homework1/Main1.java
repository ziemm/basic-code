package cn.xie.homework1;


import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author: xie
 * @create: 2020-08-23 15:55
 **/
public class Main1 {
    public static void main(String[] args) {
        Main1 obj = new Main1();
        int a = 4;
        int b = 4;
        int c = 2;
        int numberofprize = obj.numberofprize(a, b, c);
        System.out.println(numberofprize);
    }

    public int numberofprize(int a, int b, int c) {
        // write code here
        int[] arr = new int[3];
        Arrays.sort(arr);
        int count = 0;
        while (!(arr[2] - arr[1] <= 1 && arr[2] - arr[0] <= 1 && arr[1] - arr[0] <= 1)) {
            arr[2] -= arr[2];
            arr[1] -= arr[1];
            arr[0] += arr[0];
            count++;
            Arrays.sort(arr);
        }
        return count;
    }
}

