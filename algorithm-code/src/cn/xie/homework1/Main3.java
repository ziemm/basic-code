package cn.xie.homework1;

import cn.xie.TreeNode;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author: xie
 * @create: 2020-09-12 15:22
 **/
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().trim().split(" ");
        int[] arr = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        int p = sc.nextInt();
        int q = sc.nextInt();
        TreeNode root = buildTree(arr);
        TreeNode ans = lowestCommonAncestor(root, new TreeNode(p), new TreeNode(q));
        System.out.println(ans.val);
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (root.val < p.val && root.val < q.val)
                root = root.right;
            else if (root.val > p.val && root.val > q.val)
                root = root.left;
            else break;
        }
        return root;
    }
    public static TreeNode buildTree(int[] arr){
        TreeNode root = new TreeNode(arr[0]);
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        for (int i = 1; i < arr.length; i++) {
            TreeNode node = stack.peek();
            if(node.left!=null && node.right!=null){
                stack.peek();
                i--;
                continue;
            }
            if(node.left==null){
                node.left = new TreeNode(arr[i]);
                if(arr[i]!=-1)
                    stack.push(node.left);
                continue;
            }
            if(node.right==null){
                node.right = new TreeNode(arr[i]);
                if(arr[i]!=-1)
                    stack.push(node.right);
                continue;
            }
        }
        return root;
    }
}
