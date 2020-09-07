package cn.xie.homework1;

import java.util.*;

/**
 * @author: xie
 * @create: 2020-08-23 15:55
 **/
public class Main {


    /*请完成下面这个函数，实现题目要求的功能
  当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
  ******************************开始写代码******************************/
    static int findMin(int[][] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                list.add(arr[i][j]);
                }
            }

         Collections.sort(list);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)!=i+1){
                min = i+1;
                break;
            }
        }
        return min;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _arr_rows = 0;
        int _arr_cols = 0;
        _arr_rows = Integer.parseInt(in.nextLine().trim());
        _arr_cols = Integer.parseInt(in.nextLine().trim());

        int[][] _arr = new int[_arr_rows][_arr_cols];
        for(int _arr_i=0; _arr_i<_arr_rows; _arr_i++) {
            for(int _arr_j=0; _arr_j<_arr_cols; _arr_j++) {
                _arr[_arr_i][_arr_j] = in.nextInt();

            }
        }

        if(in.hasNextLine()) {
            in.nextLine();
        }

        res = findMin(_arr);
        System.out.println(String.valueOf(res));

    }
}
