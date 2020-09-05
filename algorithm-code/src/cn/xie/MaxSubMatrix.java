package cn.xie;


/**
 * @author: xie
 * @create: 2020-08-13 20:14
 **/
public class MaxSubMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {0, 1, 1, 1, 0, 0},
                {1, 1, 1, 0, 0, 1},
                {1, 1, 1, 0, 1, 0},
                {1, 1, 1, 0, 0, 1}};

        int max = 0;
        int[] height = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                height[j] = matrix[i][j] == 0 ? 0 :height[j]+1;
            }
            int rowMaxArea = areaFromBottom(height);
            max = Math.max(max,rowMaxArea);
        }
        System.out.println(max);
    }

    public static int areaFromBottom(int[] height){
        int maxArea =0;
        for (int i = 0; i < height.length; i++) {
            int j = -1;
            for (int k = i; k >=0 ; k--) {
                if(height[k]<height[i]){
                    j=k; //寻找左边界
                    break;
                }
            }
            int r = height.length-1;
            for (int k = i;k<height.length;k++){
                if(height[k]<height[i]){
                    r = k;//寻找右边界
                    break;//找到边界就跳出循环
                }
            }
            int curArea =(r-j-1)*height[i];
            maxArea = Math.max(maxArea,curArea);
        }
        return maxArea;
    }
}
