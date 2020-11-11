package cn.xie.homework1;
import java.util.*;

/**
 * @author: xie
 * @create: 2020-08-23 15:55
 **/
public class Main {
    public static void main(String[] args) {
        int res =0;
        res =res <<1;
        res =res <<1;
        System.out.println(res);
    }
    public int NumberOf1(int n) {
        int count =0;
        while (n!=0){
          if((n&1)==1)
              count++;
          n >>>= 1;
        }
        return count;
    }

}
