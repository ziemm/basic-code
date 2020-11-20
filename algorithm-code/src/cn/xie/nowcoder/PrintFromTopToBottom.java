package cn.xie.nowcoder;

import cn.xie.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树的层次遍历
 *
 * @author: xie
 * @create: 2020-11-20 20:43
 **/
public class PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null)
            return res;
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            res.add(cur.val);
            if (cur.left != null)
                queue.offer(cur.left);
            if (cur.right != null)
                queue.offer(cur.right);
        }
        return res;
    }
}
