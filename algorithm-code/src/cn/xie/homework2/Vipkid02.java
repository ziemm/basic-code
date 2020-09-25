package cn.xie.homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: xie
 * @create: 2020-09-24 19:34
 **/
public class Vipkid02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int[][] arr = new int[a][2];
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            List<List<Integer>> res = solution(arr[i][0], arr[i][1]);
            System.out.println(res.toString());
        }
    }

    public static List<List<Integer>> solution(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> elem = new ArrayList<>();
        dfs(0, 1, n, k, elem,ans);
        return ans;
    }

    private static void dfs(int sum, int start, int n, int k, List<Integer> item,List<List<Integer>> ans) {
        if (sum > n || item.size() > k)
            return;
        if (sum == n && item.size() == k) {
            ans.add(new ArrayList<>(item));
        }
        for (int i = start; i < 10; i++) {
            item.add(i);
            dfs(sum + i, i + 1, n, k, item,ans);
            item.remove(item.size() - 1);
        }
    }
}
