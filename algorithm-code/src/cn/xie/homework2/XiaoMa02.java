package cn.xie.homework2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author: xie
 * @create: 2020-09-20 15:40
 **/
public class XiaoMa02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,Integer> pv = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();//节点的根节点
            int value = sc.nextInt();
            pv.put(key,value);
        }

    }

    public static void process(int[][] pv,int n){


        //寻找根节点的字节点
        boolean flag = false;


    }
}
