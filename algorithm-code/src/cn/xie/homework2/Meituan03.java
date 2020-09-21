package cn.xie.homework2;

import java.util.Scanner;

/**
 * @author: xie
 * @create: 2020-09-20 10:38
 **/
public class Meituan03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String friends = sc.nextLine();
        String f = sc.nextLine();
        judge(friends, f, n, m);
    }

    public static void judge(String friends, String f, int n, int m) {
        if (friends.length() < f.length()) {
            System.out.println("No");
            return;
        }
        char[] ch1 = friends.toCharArray();
        char[] ch2 = f.toCharArray();
        long sum = 0;
        int count = 0;
        for (int i = 0; i < m; i++) {
            while (count < n && ch2[i] != ch1[count]) {
                count++;
            }
            if (count == n) {
                System.out.println("No");
                return;
            }
            sum += count + 1;
            count++;
        }
        System.out.println("Yes");
        System.out.println(sum);
    }
}
