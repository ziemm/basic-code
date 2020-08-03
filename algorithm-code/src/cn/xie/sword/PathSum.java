package cn.xie.sword;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author: xie
 * @create: 2020-05-28 22:18
 **/
public class PathSum {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        Stack<Integer> pathStack = new Stack<>();  //使用栈保存路径
        int currentSum =0;
        if(root==null)
            return res;
        path(root,sum,currentSum,res,pathStack);
        return res;
    }

    public void path(TreeNode root,int sum, int currentSum,List<List<Integer>> res,Stack<Integer> pathStack){
        currentSum += root.val;
        pathStack.push(root.val);

        //如果是叶节点，且路径上节点值的和等于输入的值
        //将该路径保存到一条list中
        boolean iSLeaf = root.left==null&&root.right==null;
        if(currentSum==sum&&iSLeaf){//符合要求则存入
            List<Integer> tmp = new ArrayList<>(pathStack);//
            res.add(tmp);
        }

        //如果不是叶节点，遍历子节点
        if(root.left!=null)
            path(root.left,sum,currentSum,res,pathStack);
        if(root.right!=null)
            path(root.right,sum,currentSum,res,pathStack);

        //返回父节点前，在路径上删除当前节点
        pathStack.pop();
    }

}
