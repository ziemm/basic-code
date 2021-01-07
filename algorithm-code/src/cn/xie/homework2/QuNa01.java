package cn.xie.homework2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author: xie
 * @create: 2020-09-23 19:20
 **/
public class QuNa01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        pro(m,n);
    }

//    public static void pro(int m ,int n){
//        if(m==0 || n==0){
//            System.out.println(0);
//            return;
//        }
//        if (2 * n > m)
//            n = m - n;
//
//        long a = 1;
//        for (int i = n; i >= 1; i--) {
//            a = a * m;
//            m--;
//        }
//
//        long b = 1;
//        for (int i = 1; i <= n; i++) {
//            b = b * i;
//        }
//        long res = a / b;
//        System.out.println(res);
//    }

    static Map<String,Long> map= new HashMap<>();
    private static long pro(int m,int n){
        String key= m+","+n;
        if(n==0)
            return 1;
        if (n==1)
            return m;
        if(n>m/2)
            return pro(m,m-n);
        if(n>1){
            if(!map.containsKey(key))
                map.put(key, pro(m-1,n-1)+pro(m-1,n));
            return map.get(key);
        }
        return -1;
    }


}
