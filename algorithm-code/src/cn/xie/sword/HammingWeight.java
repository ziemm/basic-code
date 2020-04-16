package cn.xie.sword;

/**
 * @author: xie
 * @create: 2020-04-12 22:24
 **/
public class HammingWeight {

    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        char[] chars = s.toCharArray();
        int count=0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='1')
                count++;
        }
       return count;
    }
    //使用位运算
    public int hammingWeight2(int n) {
       int count = 0;
       while (n!=0){
           if((n&1)==1)
               count++;
           n>>>=1;
       }
       return count;
    }

    //与运算的技巧运用,解释详见剑指offer:p102
    public int hammingWeight3(int n) {
        int count = 0;
        while(n!=0){
            ++count;
            n=(n-1)&n;
        }
        return count;
    }

}
