package cn.xie.www;

import java.util.Scanner;

/**
 * @author: xie
 * @create: 2019-10-28 08:06
 **/
public class Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] matrix = new int[100][100];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                matrix[i][j] = scan.nextInt();
            }

        }

        for(int j=1;j<=m;j++)
        {
            for(int i=n;i>0;i--){

                if(i==1)
                {
                    System.out.print(matrix[i][j]);
                    System.out.println();
                }else {
                    System.out.print(matrix[i][j]+" ");
                }
                {
                }

            }
        }

    }
}
