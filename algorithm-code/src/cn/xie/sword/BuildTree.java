package cn.xie.sword;

/**面试题07 重建二叉树
 * @author: xie
 * @create: 2020-03-02 22:06
 **/
/*
 二叉树结构的java写法
 */
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){ val= x; }
}
public class BuildTree {
    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder={9,3,15,20,7};

        BuildTree o = new BuildTree();
        TreeNode root = o.buildTree(preorder,inorder);
        System.out.println(root.right.right.val);
    }

    public TreeNode buildTree(int[] preorder,int[] inorder){
        return buildTreeCore(preorder,inorder,0,preorder.length-1,0,inorder.length-1);

    }

    public TreeNode buildTreeCore(int[] preorder,int[] inorder,int startPreorder, int endPreorder,int startInorder,int endInorder){
        if(startPreorder>endPreorder || startInorder>endInorder){
            return null;
        }
        //前序遍历的第一个是根节点
        int rootValue = preorder[startPreorder];
        TreeNode root = new TreeNode(rootValue);
        root.left=root.right=null;

        //从中序遍历结果中找出前序的根节点，分成左右子树
        int pos = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (rootValue == inorder[i]){
               pos = i;
            }
        }
        //构建左子树
        int leftLen = pos-startInorder;
        root.left=buildTreeCore(preorder,inorder,
                   startPreorder+1,//左子树的前序开头,在前序序列数组中找位置
                    startPreorder+leftLen,//左子树前序结尾,在前序序列数组中找位置
                                startInorder,//左子树的中序开头,在中序序列数组中找位置
                     pos-1);//左子树中序结尾,在中序序列数组中找位置
        //构建右子树
        root.right=buildTreeCore(preorder,inorder,startPreorder+leftLen+1,
                endPreorder,pos+1,endInorder);
        return root;

    }
}
