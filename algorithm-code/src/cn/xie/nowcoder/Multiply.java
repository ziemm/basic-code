package cn.xie.nowcoder;

/**
 * @author: xie
 * @create: 2020-12-21 09:55
 **/
public class Multiply {
    public int[] multiply(int[] A) {
        if (A == null || A.length <= 1)
            return A;
        //动态规划，分别记录左右两边的除当前位置之外左右两边乘积的数值.整体的结构可以想成上、下三角矩阵，主对角线为1
        int[] left = new int[A.length];
        int[] right = new int[A.length];

        right[A.length - 1] = 1;
        for (int i = A.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * A[i+1];
        }
        left[0] = 1;
        for (int i = 1; i < A.length; i++) {
            left[i] = left[i-1]*A[i-1];
        }
        int[] B = new int[A.length];
        for (int i = 0; i < B.length; i++) {
            B[i] = left[i]*right[i];
        }
        return B;
    }
}
