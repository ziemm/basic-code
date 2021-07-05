package cn.xie.homework1;

import java.util.*;

/**
 * @author: xie
 * @create: 2020-08-23 15:55
 **/
public class Main {
    public static void main(String[] args) {
        int[] work = {16,14,6,5,4,3,2};
        int m = 3;
        int res = distribute(work, m);
        System.out.println(res);
    }
    public static int distribute(int[] works,int m)
    {
        int n = works.length;
        int[] machines =new int[m];
        int minP = -1,minT = Integer.MAX_VALUE;
        int maxT = -1;
        int i=0,j=0;

        for(i = 0;i < n; i++)
        {
            minP = 0;
            minT = machines[0];
            for(j = 1;j < m; j++)
            {
                if(minT > machines[j])
                {
                    minP = j;
                    minT = machines[j];
                }
            }
            machines[minP] += works[i];
            if(maxT < machines[minP])
            {
                maxT = machines[minP];
            }
        }
        return maxT;
    }
}
