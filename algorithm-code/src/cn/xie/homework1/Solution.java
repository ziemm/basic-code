package cn.xie.homework1;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: xie
 * @create: 2020-08-13 20:14
 **/
public class Solution {

    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int[] subSort(int[] arr) {

        int[] arrCopy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrCopy[i]=arr[i];
        }
        Arrays.sort(arrCopy);

        int left =-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=arrCopy[i]){
                left=i;
                break;
            }
        }
        if(left==-1)
            return new int[]{-1,-1};

        int right=0;
        for (int i = arr.length-1; i >=1; i--) {
            if(arr[i]!=arrCopy[i])
                right = i;
                break;
        }
        int[] res = new int[2];
        res[0]=left;
        res[1]=right;
        return res;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] res;

        int _arr_size = 0;
        _arr_size = Integer.parseInt(in.nextLine().trim());
        int[] _arr = new int[_arr_size];
        int _arr_item;
        for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
            _arr_item = Integer.parseInt(in.nextLine().trim());
            _arr[_arr_i] = _arr_item;
        }

        res = subSort(_arr);
        for(int res_i=0; res_i < res.length; res_i++) {
            System.out.println(String.valueOf(res[res_i]));
        }

    }

}