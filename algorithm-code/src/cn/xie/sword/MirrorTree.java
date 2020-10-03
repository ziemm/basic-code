package cn.xie.sword;

import java.util.Stack;

/**
 * @author: xie
 * @create: 2020-05-20 23:15
 **/
public class MirrorTree {

    //前序遍历树的节点，并交换左右子节点
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null)
            return root;
        if(root.left==null&&root.right==null)
            return root;
        TreeNode tmp = root.left;
        root.left=root.right;
        root.right=tmp;
        if(root.left!=null)
             mirrorTree(root.left);
        if(root.right!=null)
             mirrorTree(root.right);
        return root;
    }

    //非递归
    public TreeNode mirror(TreeNode root){
        if(root==null)
            return root;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node.left!=null)
                stack.push(node.left);
            if(node.right!=null)
                stack.push(node.right);
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
        }
        return root;
    }
}
