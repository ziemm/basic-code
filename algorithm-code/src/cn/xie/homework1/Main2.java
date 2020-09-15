package cn.xie.homework1;


import java.lang.reflect.Array;
import java.util.*;

/**
 * @author: xie
 * @create: 2020-08-23 16:25
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int groups = sc.nextInt();
        for (int i = 0; i < groups; i++) {
            int n = sc.nextInt();//小岛数
            int m = sc.nextInt();//边数
            int cost = sc.nextInt();
            int[][] com = new int[m][3];
            for (int j = 0; j < com.length; j++) {
                com[j][0] = sc.nextInt();
                com[j][1] = sc.nextInt();
                com[j][2] = sc.nextInt();
            }
            if(judge(n ,m ,com)){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }

    }

    public static boolean judge(int n,int cost,int[][] com ){
        Arrays.sort(com, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });
        if(com[0][2]>cost)
            return false;
        Set<Integer> set = new HashSet<>();
        set.add(com[0][0]);
        set.add(com[0][1]);
        for (int i = 1; i < com.length; i++) {
            if(com[i][2] <= cost && set.contains(com[i][0]))
                set.add(com[i][1]);
        }
        return set.size() == n;
    }

}
