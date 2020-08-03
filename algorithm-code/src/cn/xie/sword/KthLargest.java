package cn.xie.sword;

/**
 * @author: xie
 * @create: 2020-07-29 22:11
 **/
public class KthLargest {
    private int q,ans;
    public int kthLargest(TreeNode root, int k) {
        q=k;
        kthLargestCore(root,k);
        return ans;
    }

    public void kthLargestCore(TreeNode root, int k) {
        if(root==null) return; //递归出口
        kthLargestCore(root.right,k);
        q--;
        if(q==0)
            ans=root.val;
        kthLargestCore(root.left,k);
    }
}
