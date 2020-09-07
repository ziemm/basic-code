package cn.xie;

import cn.xie.homework1.Main;

/**
 * @author: xie
 * @create: 2020-09-06 18:32
 **/
public class IsPrimeAndHuiwen {
    public static void main(String[] args) {

    }

    public int primePalindrome (int N) {

        while (true){
            if(isPrime(N) && isSu(N)){
                return N;
            }
            N++;
        }

    }

    public  boolean isPrime(int n){
        if(n <=3){
            return n>1;
        }
        for(int i =2; i<n; i++){
            if(n % i ==0)
                return false;
        }
        return true;
    }

    public boolean isSu(int N){
        String n = String.valueOf(N);
        char[] chars = n.toCharArray();
        int top = 0;
        int end = chars.length-1;
        while (top < end ){
            if(chars[top++] != chars[end--])
                return false;
        }
        return true;
    }
}
