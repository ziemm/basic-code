package cn.xie.homework1;


import java.util.Scanner;

/**
 * @author: xie
 * @create: 2020-08-23 15:55
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = findNumber(n);

        System.out.println(number[0]);
        System.out.println(number[1]);

    }
    static int[] findNumber(int num) {
        int count = Integer.bitCount(num);
        int left = num;
        int l = -1;
        while (left-->0){
            if(Integer.bitCount(left)==count){
              l = left;
              break;
            }
        }
        if(left<=0){
            l = -1;
        }

        int right = num;
        int r = -1;
        while (right++ <Integer.MAX_VALUE){
            if(Integer.bitCount(right)==count){
                r = right;
                break;
            }
        }
        if(Integer.bitCount(right)==count && right==Integer.MAX_VALUE){
            r = right;
        }else if(Integer.bitCount(right)!=count && right == Integer.MAX_VALUE){
            r=-1;
        }
        int[] res = new int[2];
        res[0] = r;
        res[1] = l;
        return res;
    }
}
