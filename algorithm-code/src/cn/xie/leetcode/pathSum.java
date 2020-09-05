package cn.xie.leetcode;

import cn.xie.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author: xie
 * @create: 2020-08-12 21:33
 **/
public class pathSum {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Stack<Integer> pathStack = new Stack<>();//用栈来保存当前路径
        if (root == null)
            return res;
        int currentSum = 0;

        path(root,target,currentSum,pathStack,res);

        return res;
    }

    /*设计一个递归数组，来计算当前sum与路径，故参数需要currentSum和stack*/
    public void path(TreeNode root, int target,
                     int currentSum, Stack<Integer> pathStack, ArrayList<ArrayList<Integer>> res){
        currentSum += root.val;
        pathStack.push(root.val);
        //判断当前节点是否为叶子节点
        boolean isLeaf = root.left==null && root.right==null;
        if(currentSum==target && isLeaf){
            ArrayList<Integer> tmp = new ArrayList<>(pathStack);
            res.add(tmp);
        }
        //左子树寻找
        if(root.left!=null){
            path(root.left,target,currentSum,pathStack,res);
        }
        if(root.right!=null){
            path(root.right,target,currentSum,pathStack,res);
        }

        //从子树返回，pop掉子树的值
        pathStack.pop();
    }
}
