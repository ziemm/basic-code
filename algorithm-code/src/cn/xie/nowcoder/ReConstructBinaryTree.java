package cn.xie.nowcoder;

import cn.xie.TreeNode;

/**
 * @author: xie
 * @create: 2020-10-28 22:30
 **/
public class ReConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        return buildTreeCore(pre,in,0,pre.length-1,0,in.length-1);
    }
    public TreeNode buildTreeCore(int[] pre,int[] in,int startPre,int endPre,int startIn,int endIn){
        if(startPre>endPre || startIn>endIn)
            return null;
        //在前序序列的第一个节点是根节点
        int rootValue = pre[startPre];
        TreeNode root = new TreeNode(rootValue);
        root.left=null;
        root.right=null;

        //中序序列中找到根节点，并将数组分成左右子树
        int pos=0;
        for (int i = 0; i < in.length; i++) {
            if(rootValue==in[i])
                pos=i;
        }

        int leftLen = pos-startIn;
        root.left=buildTreeCore(pre,in,startPre+1,startPre+leftLen,startIn,pos-1);
        root.right=buildTreeCore(pre,in,startPre+leftLen+1,endPre,pos+1,endIn);

        return root;
    }

}
