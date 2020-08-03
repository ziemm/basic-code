package cn.xie.sword;

/**
 * @author: xie
 * @create: 2020-07-29 23:02
 **/
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        int leftD = maxDepth(root.left);
        int rightD = maxDepth(root.right);

        return leftD>rightD?(leftD+1):(rightD+1);
    }
}
