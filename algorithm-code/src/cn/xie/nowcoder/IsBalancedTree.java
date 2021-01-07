package cn.xie.nowcoder;

/**
 * @author: xie
 * @create: 2020-12-08 10:16
 **/
public class IsBalancedTree {
    boolean flag = true;
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null)
            return true;
        isBalanced(root);
        return flag;

    }

    public int isBalanced(TreeNode root){
        if(root==null)
            return 0;
        int left = isBalanced(root.left);
        int right = isBalanced(root.right);
        int height = left-right;
        if(Math.abs(height)>1){
            flag = false;
            return 0;
        }
        return 1+Math.max(left,right);
    }
}
