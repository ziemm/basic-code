package cn.xie.homework2;

import java.util.*;

/**
 * @author: xie
 * @create: 2020-09-20 16:05
 **/
public class XiaoMa022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n+1];
        Tree[] trees = new Tree[n+1];

        Tree root;
        for (int i = 1; i <=n ; i++) {
            p[i] = sc.nextInt();
            trees[i] = new Tree(sc.nextInt());
            if(p[i]==-1)
                root = trees[i];
        }
        for (int i = 1; i <= n; i++) {
            if(p[i]!=-1){
                Tree parentNode = trees[p[i]];
                parentNode.children.add(trees[i]);
            }
        }
        boolean flag = false;
        for (int i = 1; i <= n ; i++) {
            if(trees[i].val==0){
                if(p[i]!=-1){
                    flag=true;
                    Tree parentNode = trees[p[i]];
                    System.out.print(i+" ");
                    parentNode.children.addAll(trees[i].children);
                }
            }
        }
        if(!flag)
            System.out.println("-1");
    }

    static class Tree{
        public int val;
        public List<Tree> children = new ArrayList<>();
        public Tree(int val){
            this.val = val;
        }
    }
}


