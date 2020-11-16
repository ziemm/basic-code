package cn.xie.nowcoder;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author: xie
 * @create: 2020-11-16 09:48
 **/
public class PrintMatrixByClockwise {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        if(matrix.length==0)
            return res;
        int left =0,right = matrix[0].length-1,top=0,bottom = matrix.length-1;
        while (true){
            for (int i = left; i <=right ; i++) res.add(matrix[top][i]);
            if(++top>bottom)break;//从左到右打印完，边界收缩是上边界+1，直到上边界>下边界
            for (int i = top; i <=bottom ; i++)res.add(matrix[i][right]);
            if(--right<left)break;
            for (int i = right; i >=left ; i--)res.add(matrix[bottom][i]);
            if(--bottom<top)break;
            for (int i = bottom; i >=top ; i--)res.add(matrix[i][left]);
            if(++left>right)break;
        }
        return res;
    }
}
