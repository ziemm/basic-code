package cn.xie.sword;

/**
 * @author: xie
 * @create: 2020-07-24 22:15
 **/
public class NthUglyNumber {
    public int nthUglyNumber(int n){
        if(n<=0) return 0;
        int[] ugly = new int[n];
        ugly[0] = 1;
        int index2=0,index3=0,index5=0,i=1;
        while (i<n){
            ugly[i]=Math.min(ugly[index2]*2,Math.min(ugly[index3]*3,ugly[index5]*5));
            //若丑数之间的间隔不大，每次找到的index2,index3,index5都小于i；
            while (ugly[index2]*2<=ugly[i]){index2++;}
            while (ugly[index3]*3<=ugly[i]){index3++;}
            while (ugly[index5]*5<=ugly[i]){index5++;}
            i++;
        }
        return ugly[n-1];
    }
}
