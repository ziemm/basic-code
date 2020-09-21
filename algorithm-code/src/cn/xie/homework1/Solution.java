package cn.xie.homework1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: xie
 * @create: 2020-08-13 20:14
 **/
public class Solution {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        List<Integer> list = null;
        for (int i = 1; i <= n; i++) {
            list = new ArrayList<>();
            for (int j = 1; j <=i ; j++) {
                list.add(fb(j));
            }
            for (Integer num : list) {
                System.out.print(num + " ");
            }
            for (int k = list.size()-2; k >=0 ; k--) {
                System.out.print(list.get(k)+" ");
            }
            System.out.println();
        }
    }

    static int fb(int n){
        if(n ==1 || n== 2)
            return 1;
        else
            return fb(n-2)+fb(n-1);
    }

}