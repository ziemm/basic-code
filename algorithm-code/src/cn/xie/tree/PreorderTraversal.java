package cn.xie.tree;

import cn.xie.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author: xie
 * @create: 2020-08-30 10:41
 **/
public class PreorderTraversal {


    /*递归 只有一个参数的写法1*/
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        helper(root, res);
//        return res;
//    }
//    private void helper(TreeNode root, List<Integer> res) {
//        if (root == null)
//            return;
//        res.add(root.val);
//        helper(root.left, res);
//        helper(root.right, res);
//    }

    /*递归 函数外使用存储的集合的写法2*/
//    List<Integer> res = new ArrayList<>();
//    public List<Integer> preorderTraversal(TreeNode root) {
//        if (root == null)
//            return res;
//        res.add(root.val);
//        preorderTraversal(root.left);
//        preorderTraversal(root.right);
//        return res;
//    }

    /*非递归 前序遍历写法
    * 非递归迭代写法不需要重复执行循环体
    * */

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null)
            return res;
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            res.add(node.val);
            if(node.right!=null)
                stack.push(node.right); //先push右节点
            if(node.left!=null)
                stack.push(node.left);
        }
        return res;
    }


}
