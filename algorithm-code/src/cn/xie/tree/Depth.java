package cn.xie.tree;


import cn.xie.TreeNode;

/**
 * @author: xie
 * @create: 2020-09-04 23:03
 **/
public class Depth {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        int ld = maxDepth(root.left)+1;
        int rd = maxDepth(root.right)+1;
         return ld>=rd? ld:rd;
    }
}
