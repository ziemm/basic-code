package cn.xie.sword;

/**
 * 面试题04
 * 确定列后再从下往上找target所在行。
 * 从左往右先剔除比target小的所在列，
 *
 * @author: xie
 * @create: 2020-02-29 22:25
 **/
public class FindNumberIn2DArray {
    public static void main(String[] args) {
        int[][] martix = {
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 16},
                {10, 13, 14, 17},
                {18, 21, 23, 26}
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
