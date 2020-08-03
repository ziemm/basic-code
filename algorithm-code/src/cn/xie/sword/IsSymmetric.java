package cn.xie.sword;

/**
 * 考虑前序遍历的序列和其对称前序遍历的序列
 * @author: xie
 * @create: 2020-05-21 21:56
 **/
public class IsSymmetric {

    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root,root);
    }

    public boolean isSymmetric(TreeNode root1,TreeNode root2){
        if(root1==null&&root2==null)
            return true;//递归出口，遍历到叶节点
        if(root1==null||root2==null)
            return false;
        if(root1.val!=root2.val)
            return false;
        return isSymmetric(root1.left,root2.right)
                &&isSymmetric(root1.right,root2.left);//该树的左子树和该树的右字树比较
    }
}
