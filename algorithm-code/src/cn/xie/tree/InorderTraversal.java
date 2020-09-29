package cn.xie.tree;

import cn.xie.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author: xie
 * @create: 2020-08-30 14:54
 **/
public class InorderTraversal {

    /*递归1 */
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        helper(root, res);
//        return res;
//    }
//    private void helper(TreeNode root, List<Integer> res) {
//        if(root == null)
//            return;
//        helper(root.left,res);
//        res.add(root.val);
//        helper(root.right,res);
//    }

    /*递归2*/
//    List<Integer> res = new ArrayList<>();
//    public List<Integer> inorderTraversal(TreeNode root) {
//        if(root == null)
//            return res;
//        inorderTraversal(root.left);
//        res.add(root.val);
//        inorderTraversal(root.right);
//
//        return res;
//    }

    /*非递归 */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null)
            return res;
        TreeNode cur = root;
        while (!stack.isEmpty() || cur!=null){
            while (cur!=null){//循环到当节点的最左节点
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            res.add(cur.val);
            cur = cur.right;
        }
        return res;
    }

}
