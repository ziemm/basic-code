package cn.xie.nowcoder;

import cn.xie.TreeNode;

/**
 * 判断树的子结构
 * 分为两步，先利用先序遍历遍历树A看是否包含树B(即判断树B的根节点在树A中是否有)
 * 再判断树B中的每个节点是否匹配树A中的每个节点（递归判断到B为null，则说明匹配成功）
 * @author: xie
 * @create: 2020-11-16 09:07
 **/
public class HasSubTree {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        boolean result = false;
        //先序遍历每个节点
        if(root1!=null&&root2!=null) {
            if (root1.val == root2.val)
                result = doesTreeHasTree(root1, root2);
            if (!result)
                result = HasSubtree(root1.left, root2);
            if (!result)
                result = HasSubtree(root1.right, root2);
        }
        return result;
    }

    //判断各个节点是否匹配
    private boolean doesTreeHasTree(TreeNode root1, TreeNode root2) {
        if(root2==null)
            return true;
        if(root1==null)
            return false;
        if(root1.val!=root2.val)
            return false;
        return doesTreeHasTree(root1.left,root2.left)&&doesTreeHasTree(root1.right,root2.right);
    }
}
