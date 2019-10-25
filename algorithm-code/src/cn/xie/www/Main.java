package cn.xie.www;

import java.util.Scanner;

/**
 * @author: xie
 * @create: 2019-10-24 15:35
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] scoreMap = new int[50][101];//默认每个分数的人数为0,利用HashMap的思想
        int[] eSources = new int[50];//存放每行成绩要查询的分数
        int index = 0;
        int n=0;
        while (!isZero(n=sc.nextInt())){
            if(n<0||n>1000){ //人数不符合要求，退出
                break;
            }
            int score;
            //将每个人的成绩循环
            for(int i =1;i<=n;i++){
                score = sc.nextInt();
                scoreMap[index][score]++; //得某分的人数+1
            }
            int iscore =sc.nextInt();
            eSources[index] = iscore;//存放每次要查询的分数
            index++;
        }
        for (int i = 0; i < index; i++) {
            System.out.println(scoreMap[i][eSources[i]]);
        }

    }

    /**
     *为了是while循环条件变成是0为false是其他数为true
     */
    public static boolean isZero(int a){
        if(a==0){
            return true;
        }else {
            return false;
        }
    }
}
