package cn.xie.sword;

/**
 * 面试题04
 * 从右往左先剔除比target大的所在列，
 * 确定列后再从上往下找target所在行。
 * 经验：二维数组中的每个分量是横向排列的，a[][]中的第一个[]中的数字表示为该二维数组的第几个元素，里面的值对应的一个二维矩阵的列号
 * @author: xie
 * @create: 2020-02-29 22:25
 **/
public class FindNumberIn2DArray {
    public static void main(String[] args) {
        int[][] martix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        FindNumberIn2DArray O = new FindNumberIn2DArray();
       boolean result = O.findNumberIn2DArray(martix, 5);
       System.out.println(result);

    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        for (int i = matrix.length-1; i >= 0; i--) {
            if (matrix[i][0] <= target) {//剔除比目标值大的列
                //找到可能的所在列后，向下找,j代表行号
                for (int j = 0; j < matrix[i].length; j++) {
                    if (target == matrix[i][j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
