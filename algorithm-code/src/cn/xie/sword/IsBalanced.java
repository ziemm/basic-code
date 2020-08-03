package cn.xie.sword;

/**
 * @author: xie
 * @create: 2020-07-30 21:48
 **/
public class IsBalanced {
    boolean flag =true;
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        height(root);
        return flag;
    }

    public int height(TreeNode root) {
        if(root==null)
            return 0;
        int left = height(root.left);
        int right = height(root.right);
        if(Math.abs(left-right)>1){
            flag = false;
            return 0;
        }
        return 1+Math.max(left,right);
    }

}
