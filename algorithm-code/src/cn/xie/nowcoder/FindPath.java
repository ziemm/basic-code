package cn.xie.nowcoder;

import cn.xie.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 打印所有二叉树中节点值的和为输入的整数的路径。路径定义为从根节点往下直到叶节点。
 * 思路：使用前序遍历+回溯的方法。路径用栈来保存（方便回溯时将栈顶pop出去，也就是返回当前节点的父节点）
 * @author: xie
 * @create: 2020-11-22 17:08
 **/
public class FindPath {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Stack<Integer> pathStack = new Stack<>();
        int curSum = 0;
        if(root==null)
            return res;
        path(root,res,pathStack,curSum,target);
        return res;

    }
    public void path(TreeNode root,ArrayList<ArrayList<Integer>> res,Stack<Integer> pathStack,int curSum,int target){
        curSum += root.val;
        pathStack.push(root.val);
        //判断是否到达叶节点
        boolean isLeaf = root.left==null&&root.right==null;
        if(isLeaf && curSum==target){
            ArrayList<Integer> temp = new ArrayList<>(pathStack);
            res.add(temp);
        }
        if(root.left!=null)
            path(root.left,res,pathStack,curSum,target);
        if(root.right!=null)
            path(root.right,res,pathStack,curSum,target);

        pathStack.pop();
    }
}
