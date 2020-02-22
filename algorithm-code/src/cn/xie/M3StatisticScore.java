package cn.xie;

import java.util.Scanner;

/**
 题目描述
 读入N名学生的成绩，将获得某一给定分数的学生人数输出。

 输入数据
 测试输入包含若干测试用例，每个测试用例的格式为

 第1行：N
 第2行：N名学生的成绩，相邻两数字用一个空格间隔。
 第3行：给定分数

 当读到N=0时输入结束。其中N不超过1000，成绩分数为（包含）0到100之间的一个整数。

 输出数据
 对每个测试用例，将获得给定分数的学生人数输出。

 样例输入
 4
 70 80 90 100
 80
 3
 65 75 85
 55
 5
 60 90 90 90 85
 90
 0
 样例输出
 1
 0
 3
 **/
public class M3StatisticScore {
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
