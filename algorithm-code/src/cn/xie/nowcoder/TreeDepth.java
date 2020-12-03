package cn.xie.nowcoder;

/**
 * @author: xie
 * @create: 2020-12-02 10:05
 **/
public class TreeDepth {
    public int TreeDepth(TreeNode root) {
        if(root==null)
            return 0;
        int left = TreeDepth(root.left)+1;
        int right = TreeDepth(root.right)+1;
        return left>right?left:right;
    }
}
