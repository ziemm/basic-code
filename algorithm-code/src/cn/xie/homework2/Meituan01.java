package cn.xie.homework2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author: xie
 * @create: 2020-09-20 10:09
 **/
public class Meituan01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        for (int i = m; i <=n ; i++) {
            if(judge(i))
                count++;
        }
        System.out.println(count);
    }

    public static boolean judge(int num) {
        int f = num % 10;
        num /= 10;
        int e = num % 10;
        num /= 10;
        int d = num % 10;
        num /= 10;
        int c = num % 10;
        num /= 10;
        int b = num % 10;
        num /= 10;
        int a = num % 10;

        if(a==0)
            return false;

        Set<Integer> set = new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);
        set.add(e);
        set.add(f);
        if(set.size()<6)
            return false;

        int ab = a*10+b;
        int cd = c*10+d;
        int ef = e*10+f;

        if(ab+cd ==ef)
            return true;

        return false;
    }
}
