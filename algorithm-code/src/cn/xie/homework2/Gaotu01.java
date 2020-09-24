package cn.xie.homework2;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Gaotu01 {
    private static class UnionFind {
        private int[] parent;

        public UnionFind(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public int find(int x) {
            while (x != parent[x]) {
                parent[x] = parent[parent[x]];
                x = parent[x];
            }
            return x;
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) {
                return;
            }
            parent[rootX] = rootY;
        }
    }

    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static List<List<String>> mergeAccount(List<List<String>> accounts) {
        // 在此处编写实现代码逻辑
        int len = accounts.size();

        List<List<String>> res = new ArrayList<>();
        if (len == 0) {
            return res;
        }

        UnionFind unionFind = new UnionFind(len);
        // 邮箱：用户的编号
        Map<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < len; i++) {
            // 拿到这个用户的名字和邮箱列表
            List<String> account = accounts.get(i);
            int currentSize = account.size();

            for (int j = 1; j < currentSize; j++) {
                String email = account.get(j);
                Integer personId = hashMap.get(email);
                if (personId == null) {
                    hashMap.put(email, i);
                } else {
                    unionFind.union(i, personId);
                }
            }
        }

        // 用户编号：邮件列表
        Map<Integer, List<String>> emailList = new HashMap<>(len);
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {

            String email = entry.getKey();
            Integer personId = entry.getValue();

            // 找到这个人的代表元
            int rootPerson = unionFind.find(personId);
            List<String> rootEmailList = emailList.get(rootPerson);

            if (rootEmailList == null) {
                List<String> temp = new ArrayList<>();
                temp.add(email);
                emailList.put(rootPerson, temp);
            } else {
                rootEmailList.add(email);
            }
        }

        for (int personId : emailList.keySet()) {
            List<String> temp = emailList.get(personId);
            Collections.sort(temp);

            List<String> account = new ArrayList<>();
            account.add(accounts.get(personId).get(0));
            account.addAll(temp);
            res.add(account);
        }
        return res;

    }
    /******************************结束写代码******************************/


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int _count = Integer.parseInt(in.nextLine());

        int _i = 0;
        List<List<String>> _accounts = new ArrayList<List<String>>();
        while (_i++ < _count) {
            String _line = in.nextLine();
            String[] _item = _line.split(",");
            _accounts.add(Arrays.asList(_item));
        }

        List<List<String>> res = mergeAccount(_accounts);

        Collections.sort(res, new Comparator<List<String>>() {

            @Override
            public int compare(List<String> o1, List<String> o2) {
                String aName1 = String.join(",", o1);
                String aName2 = String.join(",", o2);
                return aName1.compareTo(aName2);
            }

        });

        for (int res_i = 0; res_i < res.size(); res_i++) {
            List<String> resItem = res.get(res_i);
            System.out.println(String.join(",", resItem));
        }
    }
}
