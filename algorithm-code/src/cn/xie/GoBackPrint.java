package cn.xie;

import java.util.Scanner;

/**
 * @author: xie
 * @create: 2020-09-01 18:48
 **/
public class GoBackPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int beginIndex = sc.nextInt();
        int outNums = sc.nextInt();
        outputs(arr,outNums,beginIndex,len);
    }

    public static void outputs(int[] arr,int outNums,int beginIndex,int len){
        int t =0;
        int index = beginIndex-1;
        while (true){
            if(index<len-1){
                for (int j =  index+1; j <arr.length ; j++) {
                    System.out.println(arr[j]);
                    t++;
                    if(t==outNums)
                        return;
                }
                index = len-1;
            }
            if(index==len-1){
                for (int j = index-1 ; j >=0 ; j--) {
                    System.out.println(arr[j]);
                    t++;
                    if(t==outNums)
                        return;
                }
                index =0;
            }
        }
    }
}
