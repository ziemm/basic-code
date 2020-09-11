package cn.xie.homework1;

import cn.xie.TreeNode;

import java.util.*;

/**
 * @author: xie
 * @create: 2020-08-23 15:55
 **/
public class Main {
    static List<Integer> preList = new ArrayList<>();
    static List<Integer> inList = new ArrayList<>();
    static List<Integer> postList = new ArrayList<>();

    public int[][] threeOrders (TreeNode root) {
        // write code here
        preOrder(root);
        inOrder(root);
        postOrder(root);
        int[] pre = preList.stream().mapToInt(Integer::intValue).toArray();
        int[] in = inList.stream().mapToInt(Integer::intValue).toArray();
        int[] post = postList.stream().mapToInt(Integer::intValue).toArray();
        int[][] res = new int[3][pre.length];
        res[0]=pre;
        res[1]=in;
        res[2]=post;

        return res;
    }

    public void preOrder(TreeNode root){
        if(root==null)
            return;
        preList.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(TreeNode root){
        if(root==null)
            return;
        inOrder(root.left);
        inList.add(root.val);
        inOrder(root.right);
    }

    public void postOrder(TreeNode root){
        if(root==null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        postList.add(root.val);
    }

}
