package cn.xie.sword;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 层序打印，每层打印到一行，需要两个变量记录当前层还剩节点个数，以及下一层节点数目
 *
 * @author: xie
 * @create: 2020-05-25 20:44
 **/
public class LevelOrder2 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if (root == null)
            return list;
        queue.offer(root);
        int nextLevel = 0;
        int toBeprint = 1;
        List<Integer> list1 = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode poll = queue.peek();
            list1.add(poll.val);
            if (poll.left != null){
                queue.offer(poll.left);
                ++nextLevel;
            }
            if (poll.right != null){
                queue.offer(poll.right);
                ++nextLevel;
            }
            queue.poll();
            --toBeprint;
            if(toBeprint==0){
                list.add(list1);
                list1 = new ArrayList<Integer>();//换行后新建一个数组
                toBeprint=nextLevel;
                nextLevel=0;
            }
        }
    return list;
    }
}
