package cn.xie.homework1;


import java.util.Scanner;

/**
 * @author: xie
 * @create: 2020-04-23 19:07
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //数组长度
        int n = scan.nextInt();
        if(n==0){
            System.out.println(0);
        }else {
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i]=scan.nextInt();
            }

            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum+=count(arr[i]);
            }
            System.out.println(sum);
        }

    }

    public static int count(int num){
        if(num<=1)
            return 0;
        if(num==2 || num==3)
            return 1;
        if(num%2==0){
            return num/2;
        }else {
            return (num-3)/2+1;
        }

    }

}
