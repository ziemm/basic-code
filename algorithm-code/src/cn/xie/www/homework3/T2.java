package cn.xie.www.homework3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: xie
 * @create: 2019-12-11 15:55
 **/
public class T2 {
    private static int N;
    private static int[] num = new int[30];
    private static boolean[] used = new boolean[30];
    private static char[][] s = new char[5][30];
    static int x(char ch){
        return  ch-'A'+1;
    }

    /**
     *
     * @param x 行
     * @param y 列
     * @param carry 进位
     */
    private static  void dfs(int x,int y,int carry){
        if(x==0){
            if(carry == 0){
                //最后一列不能有进位
                for (int i = 1; i < N; i++) {
                    System.out.print(num[i]+" ");
                }
                System.out.println(num[N]);
            }
            return;
        }
        for (int i = x-1; i >=1 ; i--) {
            int x1 = num[x(s[1][i])];//第一行代表的数字
            int x2 = num[x(s[2][i])];//第二行代表的数字
            int x3 = num[x(s[3][i])];//第三行代表的数字
            if(x1==-1||x2==-1||x3==-1)
                continue;
            if((x1+x2)%N!=x3&&(x1+x2+1)%N!=x3)
                return;
        }

        if(num[x(s[y][x])]==-1){
            for (int i =N-1;i>=0;i--){//倒着枚举
                if(!used[i]){
                    if(y!=3){
                        num[x(s[y][x])]=i;
                        used[i] =true;
                        dfs(x, y + 1, carry);
                        num[x(s[y][x])] = -1;
                        used[i] = false;
                    }else {
                        int sum =num[x(s[1][x])]+num[x(s[2][x])]+carry;//两个数加上它们的进位
                        if (sum % N != i)
                            continue;
                        used[i] = true;
                        num[x(s[3][x])] = i;
                        dfs(x - 1, 1, sum / N);// 搜索下一列，进位需要改变
                        num[x(s[3][x])] = -1;
                        used[i] = false;
                    }
                }
            }
        }else {
            if(y!=3){
                dfs(x,y+1,carry);
            }else {
                int sum = num[x(s[1][x])]+num[x(s[2][x])]+carry;
                if(sum%N!=num[x(s[3][x])])
                    return;
                dfs(x-1,1,sum/N);// 搜索下一列，进位需要改变
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        N =sc.nextInt();
        for (int i = 1; i <= 3 ; i++) {
            char[] temp =sc.next().toCharArray();
            for (int j = 0; j < temp.length; j++) {
                s[i][j+1]=temp[j];
            }
        }
        Arrays.fill(num,-1);
        dfs(N,1,0);
    }
}
