package cn.xie.www;

import java.util.Collections;
import java.util.Scanner;

/**
 * 利用枚举法割绳子.
 * 有N条绳子，它们的长度分别为𝐿_𝑖。如果从它们中切割出K条长度相同的绳子的话，这K条绳子每条最长能有多长？答案保留到小数点后2位
 * 算法思路：按照按照试长度的思想，利用二分法求最佳长度。
 *          先求出最理想的长度（绳子长度之和/分割条数）
 *          在0与最理想长度之间进行试长，取中间长度作为临时长度，并将每条绳子的长度/临时长度的数量相加得到count。
 *          切割绳子数量count多于要求的数量，则可以增加绳子切割长度，
 *          切割绳子数量count小于要求的数目，则需要减小身子切割长度，并最终求出最合适长度。
 * @author: xie
 * @create: 2019-09-19 09:33
 **/
public class M1CutRope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入绳子个数N：");
        int n =sc.nextInt();
        System.out.println("请输入分隔的条数K：");
        int k =sc.nextInt();
        Double[] ropes = new Double[n];
        System.out.println("请输入每条绳子的长度：");
        for (int i = 0; i < n; i++) {
            ropes[i]=sc.nextDouble();
        }
        if(k<=0){
            System.out.println("输入长度有误!");
        }else{
            //求出最理想的长度
            Double sumLen = 0.00;
            for (int i = 0; i < ropes.length; i++) {
                sumLen += ropes[i];
            }
            Double optimalLen= sumLen/k;
            Double minLen=0.00;
            Double mid=0.00;
            int[] counts = new int[ropes.length];//记录每条绳子分隔得到的绳子数
            for(int j = 0;j<100;j++){
                 mid = (minLen+optimalLen)/2;
                int count =0;
                for (int i = 0; i <ropes.length ; i++) {
                    counts[i]=(int)(ropes[i]/mid);
                    count +=counts[i];
                }
                if(count>=k){ //切割绳子数量count多于要求的数量，则可以增加绳子切割长度
                    minLen =mid;
                }else{//切割绳子数量count小于要求的数目，则需要减小身子切割长度
                    optimalLen=mid;
                }
            }
            //结果保留两位小数
            String result = String.format("%.2f", mid);

            //按照要求格式化输出，结果保留两位小数
            String str="";
            for (int i = 0; i < counts.length-1 ; i++) {
                str+=counts[i]+"条、";
            }
            System.out.println(result+"(每条绳子分别可以得到"+str+counts[counts.length-1]+"条，共计"+k+"条）");
        }
    }


}
