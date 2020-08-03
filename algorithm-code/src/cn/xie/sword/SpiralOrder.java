package cn.xie.sword;

/**
 * @author: xie
 * @create: 2020-05-21 22:44
 **/
public class SpiralOrder {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return new int[0];
        int l = 0, r = matrix[0].length - 1, t = 0, b = matrix.length - 1, x = 0;
        int[] res = new int[(r + 1) * (b + 1)];

        while (true) {
            for (int i = l; i <= r; i++) res[x++] = matrix[t][i]; //left->right
            if (++t > b) break; //从左向右打印完毕边界收缩是t+1,完毕是t>b
            for (int i = t; i <= b; i++) res[x++] = matrix[i][r];
            if (l > --r) break; //从上到下打印完毕 边界收缩是r-1，完毕是l>r
            for (int i = r; i >= l; i--) res[x++] = matrix[b][i];
            if (t > --b) break;
            for (int i = b; i >= t; i--) res[x++] = matrix[i][l];
            if (++l > r) break;
        }
        return res;
    }
}
