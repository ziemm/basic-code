package cn.xie.tree;

import cn.xie.TreeNode;

import javax.lang.model.element.VariableElement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @author: xie
 * @create: 2020-08-30 12:03
 **/
public class PostorderTraversal {
    public static void main(String[] args) {
        PostorderTraversal obj = new PostorderTraversal();

        TreeNode root = null;
        //TreeNode left = new TreeNode(3);
       // TreeNode right = new TreeNode(2);
        //root.left =left;
        //root.right = right;
        List<Integer> integers = obj.postorderTraversal(root);
        for (Integer integer : integers) {
            System.out.println(integer);
        }

    }

    /*递归1 */
//    public List<Integer> postorderTraversal(TreeNode root){
//        List<Integer> res =  new ArrayList<>();
//        helper(root,res);
//        return res;
//    }
//    private void helper(TreeNode root, List<Integer> res) {
//        if(root==null)
//            return;
//        helper(root.left,res);
//        helper(root.right,res);
//        res.add(root.val);
//    }

    /*递归2 外部使用集合*/
//    List<Integer> res =  new ArrayList<>();
//    public List<Integer> postorderTraversal(TreeNode root){
//        if(root==null)
//            return res;
//        postorderTraversal(root.left);
//        postorderTraversal(root.right);
//        res.add(root.val);
//
//        return res;
//    }

    /*非递归迭代  形式和前序非递归一样，只不过改变一下顺序 根右左 -->(reverse) 左右根 */
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if(root == null)
            return res;

        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            res.add(node.val);
            if(node.left!=null)
                stack.push(root.left);
            if(node.right!=null)
                stack.push(root.right);
        }

        //根右左 -> 左右根
        Collections.reverse(res);
        return res;
    }

}
