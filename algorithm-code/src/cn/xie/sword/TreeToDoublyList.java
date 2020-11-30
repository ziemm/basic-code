package cn.xie.sword;

/**
 * @author: xie
 * @create: 2020-06-06 22:18
 **/


public class TreeToDoublyList {


    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }

    Node head = null, pre = null, tail = null;

    public Node treeToDoublyList(Node root) {
        if (root == null) return root;
        //中序遍历访问节点并连接
        inorder(root);
        //连接头尾节点
        head.left=tail;
        tail.right=head;
        return head;
    }

    private void inorder(Node root) {
        //递归出口
        if (root == null) return;
        //访问左子树
        inorder(root.left);
        //将当前节点与上一个节点连接
        if (pre == null) head = root;
        else pre.right = root;
        root.left = pre;
        pre = root;
        tail = root;
        //访问右子树
        inorder(root.right);
    }
}
