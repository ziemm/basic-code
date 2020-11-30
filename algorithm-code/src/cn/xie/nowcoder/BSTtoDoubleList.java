package cn.xie.nowcoder;

import cn.xie.sword.TreeToDoublyList;

/**
 * @author: xie
 * @create: 2020-11-24 10:25
 **/
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }

}
public class BSTtoDoubleList {
    public static void main(String[] args) {
       BSTtoDoubleList obj  = new BSTtoDoubleList();
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);

        b.left=a;
        b.right=c;

        TreeNode res= obj.Convert(b);
        System.out.println(res.left.val);
    }

    TreeNode tail=null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null)
            return null;
        TreeNode head = Convert(pRootOfTree.left);
        if(head==null)
            head=pRootOfTree;

        pRootOfTree.left = tail;
        if(tail!=null)
            tail.right=pRootOfTree;
        tail = pRootOfTree;
        Convert(pRootOfTree.right);

        return head;
    }

}
