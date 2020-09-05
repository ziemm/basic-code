package cn.xie.sword;

/**
 * @author: xie
 * @create: 2020-08-09 18:12
 **/
public class LowestCommonAncestor {
//    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
//        while (root!=null){
//            if(root.val<p.val&&root.val<q.val)
//                root = root.right;
//            else if(root.val>p.val&&root.val>q.val)
//                root = root.left;
//            else break;
//        }
//        return root;
//    }

    //不是二叉排序数时
    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        if(root==null ||root ==p || root ==q) return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left == null && right == null) return null;
        if(left==null) return right;
        if(right ==null) return left;
        return root;
    }
}
