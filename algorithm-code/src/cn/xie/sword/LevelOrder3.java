package cn.xie.sword;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *之形打印二叉树
 * @author: xie
 * @create: 2020-05-25 21:19
 **/
public class LevelOrder3 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if (root == null)
            return list;
        queue.offer(root);
        boolean flag = true; //添加标志位 false说明当前层为奇数

        while (!queue.isEmpty()) {
            List<Integer> list1 = new ArrayList<>();
            int size = queue.size();
            if (flag) {//如果当前行是奇数行
               while (size-->0){
                   TreeNode cur = queue.pollFirst();
                   list1.add(cur.val);
                   if(cur.left!=null)queue.offer(cur.left);
                   if(cur.right!=null)queue.offer(cur.right);
               }
            }else {
                while (size-->0){
                    TreeNode cur = queue.pollLast();
                    list1.add(cur.val);
                    if(cur.right!=null)queue.addFirst(cur.right);
                    if(cur.left!=null)queue.addFirst(cur.left);
                }
            }
            flag=flag?false:true;//更改标志位
            list.add(list1);
        }
        return list;
    }
}
