package cn.xie.sword;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 层序打印二叉树
 * @author: xie
 * @create: 2020-05-25 20:14
 **/
public class LevelOrder {

    public int[] levelOrder(TreeNode root) {
        Queue<TreeNode> queue =new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        if(root==null)
            return  new int[0];
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode poll = queue.poll();
            list.add(poll.val);
            if(poll.left!=null)queue.offer(poll.left);
            if(poll.right!=null)queue.offer(poll.right);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
