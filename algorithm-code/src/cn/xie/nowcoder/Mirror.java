package cn.xie.nowcoder;

import java.util.Stack;

/**
 * @author: xie
 * @create: 2020-12-02 10:14
 **/
public class Mirror {
    public void Mirror(TreeNode root) {
        if(root==null)
            return;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        if(root.left!=null)
            Mirror(root.left);
        if(root.right!=null)
            Mirror(root.right);
    }

    /**
     * 非递归
     * @param root
     */
    public void Mirror1(TreeNode root) {
        if(root==null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node.left!=null)
                stack.push(node.left);
            if(node.right!=null)
                stack.push(node.right);
            //操作
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
        }
    }
}
